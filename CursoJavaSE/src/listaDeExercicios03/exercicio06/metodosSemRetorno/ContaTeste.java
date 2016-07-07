package listaDeExercicios03.exercicio06.metodosSemRetorno;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Giselle", 250.55, 5545);
		Conta c2 = new Conta("Edney", 0, 5484);
		
		//atribuindo valores a meus objetos de conta
		System.out.println("CONTAS: ");
		System.out.println("Nome do Cliente: " + c1.getNomeCliente());
		System.out.println();
		System.out.println("Saldo do Cliente: " + c1.getSaldoConta());
		System.out.println();
		System.out.println("Número da Conta: " + c1.getNumeroConta());
		System.out.println();
		
		System.out.println("******************************************");
		
		System.out.println("Nome do Cliente: " + c2.getNomeCliente());
		System.out.println();
		System.out.println("Saldo do Cliente: " + c2.getSaldoConta());
		System.out.println();
		System.out.println("Número da Conta: " + c2.getNumeroConta());
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		//depositando
		System.out.println("Depositando...");
		System.out.println();
		c1.depositar(200.50);
		System.out.println();
		c2.depositar(20.55);
		System.out.println("******************************************");
		
		//sacando
		System.out.println("Sacando...");
		System.out.println();
		c1.sacar(200.50);
		System.out.println();
		c2.sacar(20.55);
		System.out.println("******************************************");
		
		//transferindo
		System.out.println("Transferindo...");
		System.out.println();
		System.out.println();
		c1.transferir(c2, 1000.68);
		System.out.println();
		c2.transferir(c1, 1000.68);
		System.out.println();
		c2.transferir(c1, 20.55);
		System.out.println("******************************************");
		
		//exibindo
		System.out.println("Exibindo...");
		System.out.println();
		c1.consultarSaldo();
		System.out.println();
		c2.consultarSaldo();
		
	}
	
}
