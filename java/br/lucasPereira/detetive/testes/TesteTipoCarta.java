package br.lucasPereira.detetive.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.lucasPereira.detetive.TipoCarta;
import br.lucasPereira.detetive.TipoCategoriaCarta;

public class TesteTipoCarta {

	@Test
	public void coronelMostarda() {
		assertEquals(TipoCategoriaCarta.PERSONAGEM, TipoCarta.CORONEL_MOSTARDA.obterCategoria());
	}

}
