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
		// Declra��o de vari�veis
		double triangulo;
		double altura;
		double base;

		// Pegando informa��o do usu�rio
		System.out.println("Informe o valor altura:");
		altura = sc.nextDouble();

		System.out.println("Informe o valor base:");
		base = sc.nextDouble();

		// Calculando a �rea do triangulo
		triangulo = altura * base;

		System.out.println("A �rea do tri�ngulo �: " + triangulo);
		
		sc.close();
	}

}
