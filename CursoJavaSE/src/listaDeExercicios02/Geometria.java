package listaDeExercicios02;

/**
 * nome: Array Bidimencional data: 27/04/2016 n�mero: 16
 * 
 * @author Nadine
 *
 */
import java.util.Scanner;

public class Geometria {

	public static void main(String[] args) {

		// menu
		System.out.println();
		System.out.println("***********************************");
		System.out.println("********* MENU DE OPCOES **********");
		System.out.println("***********************************");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		// Declra��o de vari�veis
		double triangulo;
		double altura;
		double base;
		double raio;
		double resultado;

		System.out.println("Digite o numero da operacao:");
		System.out.println("1 - calcular a area de um triangulo");
		System.out.println("2 - calcular a area de um circulo");

		// recebendo o valor inserido pelo cliente.
		String valorDigitadoPeloUsuario = sc.nextLine();

		System.out.println();

		switch (valorDigitadoPeloUsuario) {

		case "1":
			System.out.println("C�lculando a �rea do tri�ngulo...");

			System.out.println("Informe o valor altura:");
			altura = sc.nextDouble();

			System.out.println("Informe o valor base:");
			base = sc.nextDouble();

			// Calculando a �rea do triangulo
			triangulo = altura * base;

			System.out.println("Seu resultado e: " + triangulo);
			break;

		case "2":
			System.out.println("C�lculando a �rea do c�rculo...");

			System.out.println("Informe o valor do raio: ");
			raio = sc.nextDouble();
			final Double PI = 3.14159265359;
			resultado = PI * (raio * raio);
			System.out.println("A area do circulo: " + resultado);
			break;

		default:
			System.out.println("A op��o escolhida n�o � v�lida !");

		}
		// Fechando a classe Scanner.
		sc.close();
	}
}
