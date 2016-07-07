package listaDeExercicios03.exercicio05.pooJavaBeanConta;

public class ContaTeste {

	public static void main(String[] args) {
		
		//criando dois objetos do tipo conta
		Conta c1 = new Conta("Giselle", 250.55, 5545);
		Conta c2 = new Conta(4047);
		c2.setNomeCliente("Edney");
		c2.setSaldoConta(0.50);
		
		
		//atribuindo valores a meus objetos de conta
		System.out.println("CONTAS: ");
		System.out.println("Nome do Cliente: " + c1.getNomeCliente());
		System.out.println();
		System.out.println("Saldo do Cliente: " + c1.getSaldoConta());
		System.out.println();
		System.out.println("Número da Conta: " + c1.getNumeroConta());
		System.out.println();
		
		System.out.println("Nome do Cliente: " + c2.getNomeCliente());
		System.out.println();
		System.out.println("Saldo do Cliente: " + c2.getSaldoConta());
		System.out.println();
		System.out.println("Número da Conta: " + c2.getNumeroConta());
		System.out.println();
		
	}
	
}
