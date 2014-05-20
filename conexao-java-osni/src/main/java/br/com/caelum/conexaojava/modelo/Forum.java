package br.com.caelum.conexaojava.modelo;

public class Forum {
	public static void main(String[] args) {
		String titulo = "Luan Santana no Conexão Java?";
		String conteudo = "É impressão minha ou o Matheus parece com o Luan Santana? Além disso, o Mauricio parece com o Encantado do Shrek! Mais aguém acha isso?";
		String autor = "Joviane";

		Pergunta pergunta = new Pergunta(titulo, conteudo, autor);
		
		System.out.println("Titulo: " + pergunta.getTitulo());
		System.out.println("Conteudo: " + pergunta.getConteudo());
		System.out.println("Autor: " + pergunta.getAutor());
		
		Resposta resposta = new Resposta("Sim, eles são muito parecidos! Impressionante!");
		
		pergunta.respondeCom(resposta);
		
		System.out.println("Resposta: " + pergunta.getResposta());
	}
}

