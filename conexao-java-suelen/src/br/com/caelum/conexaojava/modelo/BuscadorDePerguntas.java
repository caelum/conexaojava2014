package br.com.caelum.conexaojava.modelo;

import java.util.ArrayList;
import java.util.List;

public class BuscadorDePerguntas {
	
	private List<Pergunta> perguntas = new ArrayList<Pergunta>();
	
	public BuscadorDePerguntas() {
		String titulo = "Luan Santana no Conex�o Java?";
		String conteudo = "� impress�o minha ou o Matheus parece com o Luan Santana? Al�m disso, o Mauricio parece com o Encantado do Shrek! Mais algu�m acha isso?";
		String autor = "Joviane";

		Pergunta pergunta1 = new Pergunta(titulo, conteudo, autor);
		
		Resposta resposta1 = new Resposta("Sim, eles s�o muito parecidos! Impressionante!");
		pergunta1.respondeCom(resposta1);
		
		Resposta resposta2 = new Resposta("Achei que s� eu tinha percebido isso, tamb�m achei os dois muito parecidos.");
		pergunta1.respondeCom(resposta2);
		
		Resposta resposta3 = new Resposta("Ele n�o s� parece, ele � o pr�prio Luan Santana.");
		pergunta1.respondeCom(resposta3);
		
		this.perguntas.add(pergunta1);
		
		titulo = "Estou sonhando ou vi o Encantado aqui no Conex�o Java?";
		conteudo = "Acho que vi o encantado no evento, algu�m mais o viu?";
		autor = "An�nimo";
		Pergunta pergunta2 = new Pergunta(titulo, conteudo, autor);
		
		this.perguntas.add(pergunta2);
	}
	
	public Pergunta buscaPorId(int id) {		
		return this.perguntas.get(id-1);
	}

	public List<Pergunta> getPerguntas() {
		return this.perguntas;
	}

	public void adiciona(Pergunta pergunta) {
		this.perguntas.add(pergunta);
	}

}
