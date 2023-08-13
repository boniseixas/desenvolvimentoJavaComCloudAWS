package br.com.seso.lanchonete;

import br.com.seso.lanchonete.atendimento.Atendente;
import br.com.seso.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoNalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
			
		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
	}

}
