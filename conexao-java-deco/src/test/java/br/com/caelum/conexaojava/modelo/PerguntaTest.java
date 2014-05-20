package br.com.caelum.conexaojava.modelo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PerguntaTest {

	@Test
	public void deveValidarPerguntaCorretamente() {
		String titulo = "Luan Santana no Conexão Java?";
		String conteudo = "É impressão minha ou o Matheus parece com o Luan Santana? Além disso, o Mauricio parece com o Encantado do Shrek! Mais aguém acha isso?";
		String autor = "Joviane";

		Pergunta pergunta = new Pergunta(titulo, conteudo, autor);
		assertThat(pergunta.valida(), is(true));
	}
	
	@Test
	public void deveMarcarRespostaComoCerta() {
		String titulo = "Luan Santana no Conexão Java?";
		String conteudo = "É impressão minha ou o Matheus parece com o Luan Santana? Além disso, o Mauricio parece com o Encantado do Shrek! Mais aguém acha isso?";
		String autor = "Joviane";

		Pergunta pergunta = new Pergunta(titulo, conteudo, autor);
	
		Resposta resposta = new Resposta("Ele não só parece, ele é o próprio Luan Santana.");
		pergunta.respondeCom(resposta);

		pergunta.marcaRespostaComoCerta(resposta);
		
		assertEquals(pergunta.getRespostaCorreta(), resposta);
	}

}
