package br.com.caelum.conexaojava.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pergunta {
	private String titulo;
	private int id;
	private String conteudo;
	private String autor;
	private List<Resposta> respostas = new ArrayList<>();
	private Resposta correta;

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
	
	public void respondeCom(Resposta resposta){
		this.respostas.add(resposta);
	}

	public Resposta getRespostaCorreta() {
		return this.correta;
	}
	
	public List<Resposta> getRespostas() {
		return respostas;
	}
	
	public boolean valida() {
		return this.titulo.contains("?");
	}

	public void marcaRespostaComoCerta(Resposta resposta) {
		this.correta = resposta;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
