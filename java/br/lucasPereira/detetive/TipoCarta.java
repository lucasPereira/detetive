package br.lucasPereira.detetive;

public enum TipoCarta {

	CORONEL_MOSTARDA, DONA_BRANCA, SENHOR_MARINHO, DONA_VIOLETA, PROFESSOR_BLACK, SENHORITA_ROSA, CASTICAL;

	public TipoCategoriaCarta obterCategoria() {
		return TipoCategoriaCarta.PERSONAGEM;
	}

}
