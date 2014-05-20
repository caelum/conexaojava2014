package br.com.caelum.conexaojava.principal;

import br.com.caelum.conexaojava.modelo.Pergunta;
import br.com.caelum.conexaojava.modelo.Resposta;

public class Forum {
	public static void main(String[] args) {
		String titulo = "Luan Santana no Conex�o Java?";
		String conteudo = "� impress�o minha ou o Matheus parece com o Luan Santana? Al�m disso, o Mauricio parece com o Encantado do Shrek! Mais agu�m acha isso?";
		String autor = "Joviane";

		Pergunta pergunta = new Pergunta(titulo, conteudo, autor);
		
		System.out.println("Titulo: " + pergunta.getTitulo());
		System.out.println("Conteudo: " + pergunta.getConteudo());
		System.out.println("Autor: " + pergunta.getAutor());
		
		Resposta resposta1 = new Resposta("Sim, eles s�o muito parecidos! Impressionante!");
		pergunta.respondeCom(resposta1);
		
		Resposta resposta2 = new Resposta("Achei que s� eu tinha percebido isso, tamb�m achei os dois muito parecidos.");
		pergunta.respondeCom(resposta2);
		
		Resposta resposta3 = new Resposta("Ele n�o s� parece, ele � o pr�prio Luan Santana.");
		pergunta.respondeCom(resposta3);
		
		for (Resposta r : pergunta.getRespostas()) {
			System.out.println(r);
		}
	}
}

