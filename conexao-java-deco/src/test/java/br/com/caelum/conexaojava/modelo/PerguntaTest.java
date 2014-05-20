package br.com.caelum.conexaojava.modelo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PerguntaTest {

	@Test
	public void deveValidarPerguntaCorretamente() {
		String titulo = "Luan Santana no Conex�o Java?";
		String conteudo = "� impress�o minha ou o Matheus parece com o Luan Santana? Al�m disso, o Mauricio parece com o Encantado do Shrek! Mais agu�m acha isso?";
		String autor = "Joviane";

		Pergunta pergunta = new Pergunta(titulo, conteudo, autor);
		assertThat(pergunta.valida(), is(true));
	}
	
	@Test
	public void deveMarcarRespostaComoCerta() {
		String titulo = "Luan Santana no Conex�o Java?";
		String conteudo = "� impress�o minha ou o Matheus parece com o Luan Santana? Al�m disso, o Mauricio parece com o Encantado do Shrek! Mais agu�m acha isso?";
		String autor = "Joviane";

		Pergunta pergunta = new Pergunta(titulo, conteudo, autor);
	
		Resposta resposta = new Resposta("Ele n�o s� parece, ele � o pr�prio Luan Santana.");
		pergunta.respondeCom(resposta);

		pergunta.marcaRespostaComoCerta(resposta);
		
		assertEquals(pergunta.getRespostaCorreta(), resposta);
	}

}
