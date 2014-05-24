package br.com.caelum.conexaojava.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.conexaojava.modelo.BuscadorDePerguntas;
import br.com.caelum.conexaojava.modelo.Pergunta;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class PerguntasController {

	@Inject
	private BuscadorDePerguntas buscador;
	@Inject
	private Result result;
	
	@Path("/")
	public void lista(){
		List<Pergunta> perguntas = this.buscador.getPerguntas();
		result.include("perguntas", perguntas);
	}
	
	public void verPergunta(int id){
		Pergunta pergunta = this.buscador.buscaPorId(id);
		result.include("pergunta", pergunta);
	}
	
	public void mostraFormulario(){

	}
	
	public void adiciona(Pergunta pergunta){
		this.buscador.adiciona(pergunta);
		result.redirectTo(PerguntasController.class).lista();
	}
}