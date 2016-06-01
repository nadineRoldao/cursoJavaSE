package listaDeExercicios02;

/*
nome:maior ou menor
data:26/04
número:exercício 15
*/
import java.util.Scanner;

public  class MaiorOuMenor {

	public static void main(String[] args) {
	
		//MENU
		System.out.println("");
		System.out.println("******************************");
		System.out.println("******* MAIOR OU MENOR *******");
		System.out.println("******************************");
		System.out.println("");
	
		//declarações das variáveis
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[6];
	
		// recuperando as informações fornecidas pelo usuário		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o numero " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}
	
		// Declaração de variáveis
		int maior = numeros[0];
		int menor = numeros[0];
		
		// verificando qual é o maior e o menor número presente na lista
		for(int i = 0; i < numeros.length; i++) {
	
			//verificando o maior numero
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
	
			//verificando o menor numero
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
	
		}
	
		System.out.println("Valor maior dos numeros digitados e: " + maior);
		System.out.println("Valor menor dos numeros digitados e: " + menor);
	
		sc.close();
	}

}

