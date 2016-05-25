package listaDeExercicios02;

import java.util.Scanner;

/*
	nome:é par ou impar
	data:19/04
	número:exercício 07
*/
public class ParOuImparComTernario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero;

		// Menu principal
		System.out.println("");
		System.out.println("****************************");
		System.out.println("******* PAR OU IMPAR *******");
		System.out.println("****************************");
		System.out.println("");

		System.out.println("Informe um numero qualquer: ");
		numero = sc.nextInt();

		boolean isPar = numero % 2 == 0;
		String resultado = isPar ? "e par" : "e impar";

		System.out.println(resultado);

		sc.close();
	}

}