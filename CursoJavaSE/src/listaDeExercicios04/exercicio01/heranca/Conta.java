package listaDeExercicios04.exercicio01.heranca;

import java.io.Serializable;

public abstract class Conta implements Serializable {

	//implementando a interface serializable
	private static final long serialVersionUID = 1L;
	
	//atributos
	private int numeroConta;
	private String nomeCliente;
	private float saldoConta;
	
	//construtores
	public Conta() {
		
	}

	public Conta(int numeroConta, String nomeCliente, float saldoConta) {
		super();
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldoConta = saldoConta;
	}

	//métodos
	public float consultarSaldo(){
		return saldoConta;
	}
	
	public void transferir(Conta contaDestino, float valorTransferencia){
		System.out.println("O valor transferido foi: " + valorTransferencia);
		if (saldoConta >= valorTransferencia) {
			saldoConta = saldoConta - valorTransferencia;
			contaDestino.setSaldoConta(contaDestino.getSaldoConta() + valorTransferencia);
			System.out.println("Valor transferido: " + valorTransferencia);
		} else {
			System.out.println("Não foi possível realizar a transferência,");
			System.out.println("Pois o valor da transferência é maior do que o saldo da conta de quem está transferindo;");
		}
	}
	
	public void depositar(float valorDeposito){
		System.out.println("O valor depositado foi: " + valorDeposito);
		saldoConta = saldoConta + valorDeposito;
	}
	
	public void sacar(float valorSaque){
		System.out.println("O valor sacado foi: " + valorSaque);
		if (saldoConta < valorSaque) {
			System.out.println(
					"Não foi possível completar a operação, pois o valor do saque é maior do que o saldo da conta");
		} else {
			saldoConta = saldoConta - valorSaque;
		}
	}
	
	public abstract float socilicitarEmprestimo(float valor);
	
	
	//Getters and Setters
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
