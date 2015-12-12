package br.lucasPereira.detetive.testes;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import br.lucasPereira.detetive.Carta;
import br.lucasPereira.detetive.Jogador;

public class TesteJogador {

	@Test
	public void semCartas() {
		Jogador lucas = new Jogador(Arrays.<Carta> asList());
		assertEquals(lucas.obterCartas().size(), 0);
	}
	
	@Test
	public void comCoronelMostarda() {
		Carta cartaCoronelMostarda = null;
		Jogador lucas = new Jogador(Arrays.<Carta> asList(cartaCoronelMostarda));
		assertEquals(1, lucas.obterCartas().size());
		assertEquals(cartaCoronelMostarda, lucas.obterCartas().get(0));
	}

}
