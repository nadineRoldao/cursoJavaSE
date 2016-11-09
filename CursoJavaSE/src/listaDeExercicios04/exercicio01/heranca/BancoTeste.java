package listaDeExercicios04.exercicio01.heranca;

public class BancoTeste {

	public static void main(String[] args) {
		
		ContaFisica cf = new ContaFisica();
		cf.setNomeCliente("nadine");
		cf.setNumeroConta(21651);
		cf.setNumeroCPF("236.485.793-4");
		cf.setSaldoConta(200.00f);
		
		ContaJuridica cj = new ContaJuridica();
		cj.setNomeCliente("nadine");
		cj.setNumeroConta(21651);
		cj.setSaldoConta(200.00f);
		cj.setNumeroCNPJ("3541515");
		
		System.out.println("SALDO DAS CONTAS:");
		cf.consultarSaldo();
		cj.consultarSaldo();
		
		System.out.println();
		
		getEmprestimo(cf);
		getEmprestimo(cj);
		
		System.out.println();
		
		getTrasferencia(cf, cj, 100.00f);
		getTrasferencia(cj, cf, 50.00f);
		
		System.out.println();
		
		getDeposito(cj, 100.00f);
		getDeposito(cf, 120.00f);
		
		System.out.println();
		
		getSacando(cj, 300.00f);
		getSacando(cf, 600.00f);
		
		
	}
	
	public static void getEmprestimo(Conta conta){
		System.out.println(conta.socilicitarEmprestimo());
	}

	public static void getTrasferencia(Conta pai, Conta contaDestino, float valorTransferencia) {
		pai.transferir(contaDestino, valorTransferencia);
	}

	public static void getDeposito(Conta pai, float valorDeposito){
		pai.depositar(valorDeposito);
	}

	public static void getSacando(Conta pai, float valorSaque){
		pai.sacar(valorSaque);
	}
	
}
