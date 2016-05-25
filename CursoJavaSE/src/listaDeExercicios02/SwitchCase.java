package listaDeExercicios02;

import java.util.Scanner;
/*
	nome: switch case
	data:19/04
	número:exercício 08
*/
public class SwitchCase {
	
	public static void main(String[] args) {
		
		 //declarando as variáveis
		Scanner sc = new Scanner(System.in);
	

		// Menu principal
		System.out.println("");
		System.out.println("************************************************");
		System.out.println("******* SWITCH CASE - calculadora basica *******");
		System.out.println("************************************************");
		System.out.println("");

		System.out.println("*********** Menu de Opcoes ********************");
		System.out.println("01: subtracao");
		System.out.println("02: adicao");
		System.out.println("03: multiplicacao");
		System.out.println("04: divisao");
		System.out.println("***********************************************");
		System.out.println();
		
		System.out.println("Selecione uma operacao entre 01 e 04 do menu para realizar o calculo: ");
		int operador = sc.nextInt();

		System.out.println("Informe o primeiro numero: ");
		double numero01 = sc.nextDouble();

		System.out.println("Informe o segundo numero: ");
		double numero02 = sc.nextDouble();

		switch(operador){

			case 1:
				System.out.println("subtracao, resultado: " + (numero01 - numero02));
				break;

			case 2:
				System.out.println("adicao, resultado: " + (numero01 + numero02));
				break;

			case 3:
				System.out.println("multiplicacao, resultado: " + (numero01 * numero02));
				break;

			case 4:
				System.out.println("divisao, resultado: " + (numero01 / numero02));
				break;
			
			default:
				System.out.println("a opcao escolhida nao existe!");

		}

		sc.close();
	}

}
