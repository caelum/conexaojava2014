package br.com.caelum.conexaojava.modelo;
public class Resposta {
	private String conteudo;

	public Resposta(String conteudo){
		this.conteudo = conteudo;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	@Override
	public String toString() {
		return this.conteudo;
	}
}
