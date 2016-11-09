package listaDeExercicios04.exercicio01.heranca;

import java.io.Serializable;

public abstract class Conta implements Serializable {

	// implementando a interface serializable
	private static final long serialVersionUID = 1L;

	// atributos
	private int numeroConta;
	private String nomeCliente;
	private float saldoConta;

	// construtores
	public Conta() {

	}

	public Conta(int numeroConta, String nomeCliente, float saldoConta) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldoConta = saldoConta;
	}

	// m�todos
	public float consultarSaldo() {
		return saldoConta;
	}

	public void transferir(Conta contaDestino, float valorTransferencia) {
		if (saldoConta >= valorTransferencia) {
			saldoConta = saldoConta - valorTransferencia;
			contaDestino.setSaldoConta(contaDestino.getSaldoConta() + valorTransferencia);
			System.out.println("Valor transferido: " + valorTransferencia);
		} else {
			System.out.println("N�o foi poss�vel realizar a transfer�ncia,");
			System.out.println(
					"Pois o valor da transfer�ncia � maior do que o saldo da conta de quem est� transferindo;");
		}
		System.out.println("SEU SALDO AGORA �:" + saldoConta);
		System.out.println();
	}

	public void depositar(float valorDeposito) {
		System.out.println("O valor depositado foi: " + valorDeposito);
		saldoConta = saldoConta + valorDeposito;
		System.out.println("SEU SALDO AGORA �:" + saldoConta);
		System.out.println();
	}

	public void sacar(float valorSaque) {
		if (saldoConta < valorSaque) {
			System.out.println(
					"N�o foi poss�vel completar a opera��o, pois o valor do saque � maior do que o saldo da conta");
		} else {
			saldoConta = saldoConta - valorSaque;
			System.out.println("O valor sacado foi: " + valorSaque);
		}
		System.out.println("SEU SALDO AGORA �:" + saldoConta);
		System.out.println();
	}

	public abstract float socilicitarEmprestimo();

	
	// Getters and Setters
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public float getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}

}
