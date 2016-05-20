package listaDeExercicios01;

import java.util.Scanner;

public class CalculoAreaTriangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Menu
		System.out.println("*************************************");
		System.out.println("**Sistema calculo area do triangulo**");
		System.out.println("*************************************");
		System.out.println();
		// Declração de variáveis
		double triangulo;
		double altura;
		double base;

		// Pegando informação do usuário
		System.out.println("Informe o valor altura:");
		altura = sc.nextDouble();

		System.out.println("Informe o valor base:");
		base = sc.nextDouble();

		// Calculando a área do triangulo
		triangulo = altura * base;

		System.out.println("A área do triângulo é: " + triangulo);
		
		sc.close();
	}

}
