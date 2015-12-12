package br.lucasPereira.detetive;

public enum TipoCarta {

	CORONEL_MOSTARDA(TipoCategoriaCarta.PERSONAGEM),
	DONA_BRANCA(TipoCategoriaCarta.PERSONAGEM),
	SENHOR_MARINHO(TipoCategoriaCarta.PERSONAGEM),
	DONA_VIOLETA(TipoCategoriaCarta.PERSONAGEM),
	PROFESSOR_BLACK(TipoCategoriaCarta.PERSONAGEM),
	SENHORITA_ROSA(TipoCategoriaCarta.PERSONAGEM),

	CASTICAL(TipoCategoriaCarta.ARMA),
	CANO(TipoCategoriaCarta.ARMA),
	CHAVE_INGLESA(TipoCategoriaCarta.ARMA),
	CORDA(TipoCategoriaCarta.ARMA),
	PUNHAL(TipoCategoriaCarta.ARMA),
	REVOLVER(TipoCategoriaCarta.ARMA),
	FACA(TipoCategoriaCarta.ARMA),

	BIBLIOTECA(TipoCategoriaCarta.ARMA);

	private TipoCategoriaCarta categoria;

	private TipoCarta(TipoCategoriaCarta categoria) {
		this.categoria = categoria;
	}

	public TipoCategoriaCarta obterCategoria() {
		return categoria;
	}

}
