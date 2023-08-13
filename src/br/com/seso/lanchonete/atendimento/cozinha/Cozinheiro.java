package br.com.seso.lanchonete.atendimento.cozinha;

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADCIONANDO LANCHE NO BALCAO");
	}
	
	public void adicionarSucoNoNalcao() {
		System.out.println("ADCIONANDO SUCO NO BALCAO");
	}
	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoNalcao();
	}
	
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO NATURAL");
	}
	
	private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÃO, SALAME, QUIEJO, ...");
	}
	
	private void selecionarIngedientesVitamina() {
		System.out.println("SELECIONANDO FRUTA, LEITE, ...");
	}
	
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}
	
	private void fritarIngedientesLanche() {
		System.out.println("FRITANDO A CARNE E  OVO PARA O LANCHE");
	}
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
