package br.lucasPereira.detetive.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.lucasPereira.detetive.TipoCarta;
import br.lucasPereira.detetive.TipoCategoriaCarta;

public class TesteTipoCarta {

	@Test
	public void pensonagens() {
		assertEquals(TipoCategoriaCarta.PERSONAGEM, TipoCarta.CORONEL_MOSTARDA.obterCategoria());
		assertEquals(TipoCategoriaCarta.PERSONAGEM, TipoCarta.DONA_BRANCA.obterCategoria());
		assertEquals(TipoCategoriaCarta.PERSONAGEM, TipoCarta.SENHOR_MARINHO.obterCategoria());
		assertEquals(TipoCategoriaCarta.PERSONAGEM, TipoCarta.DONA_VIOLETA.obterCategoria());
		assertEquals(TipoCategoriaCarta.PERSONAGEM, TipoCarta.PROFESSOR_BLACK.obterCategoria());
		assertEquals(TipoCategoriaCarta.PERSONAGEM, TipoCarta.SENHORITA_ROSA.obterCategoria());
	}

	@Test
	public void armas() {
		assertEquals(TipoCategoriaCarta.ARMA, TipoCarta.CASTICAL.obterCategoria());
	}

}
