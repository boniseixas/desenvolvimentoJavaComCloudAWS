package br.com.seso.escola;

public class Escola {
	public static void main(String[] args) {
		Aluno caio = new Aluno();
		//acessando sem os métodos gets e sets:
//		caio.nome = "Caio";
//		caio.idade = 22;
		
//		System.out.println("O aluno " + caio.nome + " tem " + caio.idade + " anos");
	
		//acessando usando os métodos gets e sets:
		caio.setNome("Caio Comum");
		caio.setIdade(25);
		
		System.out.println("O aluno " + caio.getNome() + " tem " + caio.getIdade());
	}
}
