package listaDeExercicios03.exercicio07.metodosComRetorno;

import java.io.Serializable;

public class Conta implements Serializable {

	// implementando a interface serializable
	private static final long serialVersionUID = 1L;
	// atributos de uma conta
	private String nomeCliente;
	private double saldoConta;
	private int numeroConta;

	// construtor auxiliar
	public Conta(String nomeCliente, double saldoConta, int numeroConta) {

		this.nomeCliente = nomeCliente;
		this.saldoConta = saldoConta;
		this.numeroConta = numeroConta;
	}

	// pra criar um objeto do tipo conta precisamos informar no m�nimo o n�mero
	// da conta!
	public Conta(int numeroConta) {

		this.numeroConta = numeroConta;
	}

	// m�todos execicios 06
	public double depositar(double valorDeposito) {
		System.out.println("o valor depositado : " + valorDeposito);
		saldoConta = saldoConta + valorDeposito;
		return valorDeposito;
	}

	public double sacar(double valorSaque) {
		System.out.println("o valor sacado: " + valorSaque);
		if (saldoConta < valorSaque) {
			System.out.println(
					"N�o foi poss�vel completar a opera��o, pois o valor do saque � maior do que o saldo da conta");
		} else {
			saldoConta = saldoConta - valorSaque;
		}
		
		return saldoConta;

	}

	public double transferir(Conta contaDestino, double valorTransferencia) {
		System.out.println("o valor transferido: " + valorTransferencia);
		if (saldoConta >= valorTransferencia) {
			saldoConta = saldoConta - valorTransferencia;
			// contaDestino.saldoConta = contaDestino.saldoConta +
			// valorTransferencia;
			contaDestino.setSaldoConta(contaDestino.getSaldoConta() + valorTransferencia);
			System.out.println("valor transferido: " + valorTransferencia);
		} else {
			System.out.println("n�o foi poss�vel realizar a transfer�ncia,");
			System.out.println(
					" pois o valor da transfer�ncia � maior do que o saldo da conta de quem est� transferindo;");
		}
		
		return saldoConta;
	}

	public double consultarSaldo() {
		
		return saldoConta;
	}

	// Getters and Setters
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

}
