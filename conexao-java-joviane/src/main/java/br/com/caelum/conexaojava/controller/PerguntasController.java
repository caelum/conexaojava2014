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

	@Inject //Se der tempo
	private Result result;
	@Inject
	private BuscadorDePerguntas buscador;
	
	@Path("/")
	public void index(){
	}
	
	//@Path("/pergunta/{id}") //URL bonitinha
	public Pergunta pergunta(int id){
		return buscador.buscaPorId(id);
	}
	
	public List<Pergunta> lista(){
		return buscador.getPerguntas();
	}
	
	public void listaMaisMarota(){
		result.include("perguntas", buscador.getPerguntas());
	}
}
