package br.com.seso.enums;

public enum EstadoBrasileiro {
	AMAZONAS("AM", "Amazonas", 11),
	SAO_PAULO("SP", "São Paulo", 12),
	RIO_JANEIRO("RJ", "Rio de Janeiro", 13),
	PIAUI("PI", "Piauí", 14),
	MARANHAO("MA", "Maranhão", 15),
	PARA("PA", "Pará", 16),
	CEARA("CE", "Ceará", 17)
	;
	
	private String nome;
	private String sigla;
	private int codigoIbge;
	
	private EstadoBrasileiro(String sigla, String nome, int codigoIbge) {
		this.sigla = sigla;
		this.nome = nome;
		this.codigoIbge = codigoIbge;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	public int getCodigoIbge() {
		return codigoIbge;
	}
}
