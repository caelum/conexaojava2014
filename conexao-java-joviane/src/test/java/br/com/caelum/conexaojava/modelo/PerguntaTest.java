package br.com.caelum.conexaojava.modelo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PerguntaTest {

	@Test
	public void deveValidarPerguntaCorretamente() {
		Pergunta pergunta = new Pergunta("Teste?", "", "");
		assertThat(pergunta.valida(), is(true));
	}
	
	@Test
	public void deveMarcarRespostaComoCerta() {
		Pergunta pergunta = new Pergunta("Teste?", "", "");
		Resposta resposta = new Resposta("");
		pergunta.respondeCom(resposta);

		pergunta.marcaRespostaComoCerta(resposta);
		
		assertEquals(pergunta.getRespostaCorreta(), resposta);
	}

}
