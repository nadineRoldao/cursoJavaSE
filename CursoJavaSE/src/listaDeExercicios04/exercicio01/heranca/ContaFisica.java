package listaDeExercicios04.exercicio01.heranca;

public class ContaFisica extends Conta {

	private static final long serialVersionUID = 1L;

	private String numeroCPF;

	@Override
	public void sacar(float valorSaque) {
		if (valorSaque <= 800.00 && valorSaque <= getSaldoConta()) {
			float novoSaldo = getSaldoConta() - valorSaque;
			setSaldoConta(novoSaldo);
			System.out.println("O valor sacado foi: " + valorSaque);
		} else {
			System.out.println("Você na tem saldo em sua conta");
			System.out.println("ou");
			System.out.println("Você só pode sacar até 800,00 reais, mesmo que você tenha saldo o suficiente!");
		}
	}

	@Override
	public void depositar(float valorDeposito) {
		super.depositar(valorDeposito);
		System.out.println("sobrescrito na classe filha");
	}

	@Override
	public float socilicitarEmprestimo() {
		return getSaldoConta() * 2;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

}
