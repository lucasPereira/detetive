package br.lucasPereira.detetive.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.lucasPereira.detetive.Carta;
import br.lucasPereira.detetive.CartaCoronelMostarda;
import br.lucasPereira.detetive.TipoCarta;

public class TesteCarta {

	@Test
	public void coronelMostarda() {
		Carta cartaCoronelMostarda = new CartaCoronelMostarda();
		assertEquals(TipoCarta.CORONEL_MOSTARDA, cartaCoronelMostarda.obterTipo());
	}
	
}
