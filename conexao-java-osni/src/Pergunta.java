import br.com.caelum.conexaojava.modelo.Resposta;

public class Pergunta {
	private String titulo;
	private String conteudo;
	private String autor;

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
	

	
}
