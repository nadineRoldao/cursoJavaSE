package listaDeExercicios01;

import java.util.Scanner;

public class CalculoIndiceDeMassaCorporea {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Declaração de variáveis.
		double peso;
		double altura;
		double imc;
		String resultado;

		// Menu
		System.out.println("************************");
		System.out.println("**Sistema calculo IMC***");
		System.out.println("************************");
		
		// Recuperando peso
		System.out.println();
		System.out.println("Informe seu peso: ");
		peso = sc.nextDouble();

		// Recuperando altura
		System.out.println();
		System.out.println("Informe seu altura: ");
		altura = sc.nextDouble();

		// Calculando o IMC 
		imc = peso / (altura * altura);

		// Descobrindo se a pessoa é magra, gorda ou normal
		if(imc < 20){
			resultado = "Abaixo do peso";
		}else if(imc >= 20 && imc < 25) {
			resultado = "Peso Ideal";
		}else if(imc >= 25 && imc < 30){
			resultado = "Acima do peso";
		}else{
			resultado = "Muito acima do peso";
		}

		System.out.println();
		System.out.println("O IMC foi: " + imc + " O resultado: " + resultado);
		System.out.println();
		
		sc.close();

	}

}
