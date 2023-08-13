package br.com.seso.pessoa;

public class SistemaCadastro {

	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		//definimos dois parâmetros na ciração do obejto Pessoa, porque criamos o construtor Pessoa com dois parãmetros
		Pessoa helena = new Pessoa("123", "Helena");
		
		//definimos o endereço de helena
		helena.setEndereco("Rua das Marias");
		
		System.out.println("O CPF de " + helena.getNome() + " é " + helena.getCpf());

	}

}
