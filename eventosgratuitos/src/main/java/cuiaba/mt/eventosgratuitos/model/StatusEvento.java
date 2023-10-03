package cuiaba.mt.eventosgratuitos.model;

public enum StatusEvento {
	ABERTAS("Abertas"),
	AGUARDANDO("Aguardando"),
	ENCERRADAS("Encerradas");

	private String descricao;
	StatusEvento(String descricao){
		this.descricao=descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
