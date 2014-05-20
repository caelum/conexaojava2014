package br.com.caelum.conexaojava.modelo;

import java.util.ArrayList;
import java.util.List;

public class BuscadorDePerguntas {
	
	private List<Pergunta> perguntas = new ArrayList<>();
	
	public BuscadorDePerguntas(){
		String titulo = "Luan Santana no Conexão Java?";
		String conteudo = "É impressão minha ou o Matheus parece com o Luan Santana? Além disso, o Mauricio parece com o Encantado do Shrek! Mais aguém acha isso?";
		String autor = "Joviane";

		Pergunta pergunta1 = new Pergunta(titulo, conteudo, autor);
		Resposta resposta1 = new Resposta("Sim, eles são muito parecidos! Impressionante!");
		pergunta1.respondeCom(resposta1);
		
		Resposta resposta2 = new Resposta("Achei que só eu tinha percebido isso, também achei os dois muito parecidos.");
		pergunta1.respondeCom(resposta2);
		
		Resposta resposta3 = new Resposta("Ele não só parece, ele é o próprio Luan Santana.");
		pergunta1.respondeCom(resposta3);
		
		this.perguntas.add(pergunta1);
	}
	
	public Pergunta buscaPorId(int id) {		
		return this.perguntas.get(id);
	}

	public List<Pergunta> getPerguntas() {
		return this.perguntas;
	}

}
