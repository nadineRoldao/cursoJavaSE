package listaDeExercicios03.exercicio05.pooJavaBeanConta;

import java.io.Serializable;

/**
 * 
 * @author Nadine
 * 29/06/2016
 */
public class Conta implements Serializable {
	
	//implementando a interface serializable
	private static final long serialVersionUID = 1L;
	
	// atributos de uma conta
	private String nomeCliente;
	private double saldoConta;
	private int numeroConta;
	
	
	//construtor auxiliar 
	public Conta(String nomeCliente, double saldoConta, int numeroConta){
		
		this.nomeCliente = nomeCliente;
		this.saldoConta = saldoConta;
		this.numeroConta = numeroConta;
	}
	
	//pra criar um objeto do tipo conta precisamos informar no mínimo o número da conta!
	public Conta(int numeroConta){
		
		this.numeroConta = numeroConta;
	}
	
	// Getters and Setters
	public String getNomeCliente(){
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	
	public double getSaldoConta(){
		return saldoConta;
	}
	
	public void setSaldoConta(double saldoConta){
		this.saldoConta = saldoConta;
	}
	
	public int getNumeroConta(){
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta){
		this.numeroConta = numeroConta;
	}


}
