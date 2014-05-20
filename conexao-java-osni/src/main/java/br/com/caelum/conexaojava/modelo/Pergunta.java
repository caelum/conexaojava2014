package br.com.caelum.conexaojava.modelo;

public class Pergunta {
	private String titulo;
	private String conteudo;
	private String autor;
	private Resposta resposta;

	public Pergunta(String titulo, String conteudo, String autor) {
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Resposta getResposta() {
		return resposta;
	}
	
	public void respondeCom(Resposta resposta){
		this.resposta = resposta;
	}
}
