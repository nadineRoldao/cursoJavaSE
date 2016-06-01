package listaDeExercicios02;

/*
nome:somatoria com for
data:26/04
número:exercício 13
*/
import java.util.Scanner;

public class SomatoriaComFor{

	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("*************************");
		System.out.println("******* SOMATORIA *******");
		System.out.println("*************************");
		System.out.println("");
	
		// Declaração de variáveis			
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[5];
	
		double resultado = 0.0;
		double media = 0.0;
	
		for(int i = 0; i < numeros.length; i++) {
				System.out.println("Informe o numero decimal  " + (i + 1) + ": ");
				numeros[i] = sc.nextDouble();
			}
	
		for(int i = 0; i < numeros.length; i++) {
				resultado += numeros[i];
			}
	
		System.out.println("O resultado da soma de todos os numeros decimais e: " + resultado);
	
		media = resultado / numeros.length;
	
		System.out.println("A media dos numeros informados e:  " + media);
	
		sc.close();
	}

}
