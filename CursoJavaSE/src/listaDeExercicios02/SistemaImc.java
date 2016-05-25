package listaDeExercicios02;

import java.util.Scanner;
/*
	nome:Sistema IMC
	data:20/04
	número:exercício 09
*/

public class SistemaImc{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 // declarando as variaveis

		double peso;
		double altura;
		double imc;
		String resultado;

		// Menu
		System.out.println("************************");
		System.out.println("**SISTEMA CALCULO IMC***");
		System.out.println("************************");

		System.out.println();
		System.out.println("Informe seu peso: ");
		peso = sc.nextDouble();

		System.out.println();
		System.out.println("Informe sua altura: ");
		altura = sc.nextDouble();

		// Calculando IMC 
		imc = peso / (altura * altura);

		if(imc < 18.5){

			resultado = "Voce esta muito abaixo do peso!";

		}else if(imc >= 18.5 && imc < 25) {

			resultado = "Parabens! voce esta no peso Ideal!";

		}else if(imc >= 25 && imc < 30){

			resultado = " voce esta acima do peso!";

		}else{

			resultado = "voce esta muito acima do peso!";
		}

		System.out.println();
		System.out.println("O resultado do IMC foi: " + imc + " O resultado da conta: " + resultado);
		System.out.println();

		sc.close();
	}

}
