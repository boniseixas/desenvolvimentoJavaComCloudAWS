package br.com.seso.lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS PRODUTOS PARA A LANCHONETE");
	}
	
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS PRODUTOS");
	}
	
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES PARA O COZINHEIRO");
		controlarSaida();
	}
	
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GAS");
	}
}
