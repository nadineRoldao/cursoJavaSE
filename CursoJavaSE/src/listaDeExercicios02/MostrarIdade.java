package listaDeExercicios02;

import java.util.Scanner;

/*
	nome:Mostrar Idade da Pessoa
	data:18/04
	n�mero:exerc�cio 03
*/
public class MostrarIdade {
	
	public static void main(String[] args) {
		
		 //declarando as vari�veis
		Scanner sc = new Scanner(System.in);
		int data;
		int conta;

		// Menu principal
		System.out.println("");
		System.out.println("*****************************");
		System.out.println("******* MOSTRAR IDADE *******");
		System.out.println("*****************************");
		System.out.println("");

		// Recuperando a informa�ao fornecida pelo usu�rio
		System.out.println("Informe seu ano de nascimento: ");
		data = sc.nextInt();

		//dando valor a variavel
		conta = (2016 - data);
		System.out.println("sua idade e: " + conta);

		sc.close();
	}

}