package listaDeExercicios02;

/**
 * nome: C�lculo Combustiv�l data: 27/04/2016 n�mero: 18
 * 
 * @author Nadine
 *
 */
import java.util.Scanner;

public class CalculoCombustivel {

	public static void main(String[] args) {

		// menu
		System.out.println();
		System.out.println("***********************************");
		System.out.println("********* MENU DE OPCOES **********");
		System.out.println("***********************************");
		System.out.println();

		// Criando o objeto Scanner
		Scanner sc = new Scanner(System.in);

		// Declra��o de vari�veis
		double valorTipo;
		double litros;
		double valorTotal;

		System.out.println("Digite o tipo do combust�vel: ");
		System.out.println("1 - GASOLINA ADITIVADA");
		System.out.println("2 - GASOLINA COMUM");
		System.out.println("3 - ALCOOL");

		int valorDigitadoPeloUsuario = sc.nextInt();

		System.out.println();

		switch (valorDigitadoPeloUsuario) {

		case 1:

			System.out.println("Informe quantos litros deseja abastecer: ");
			litros = sc.nextDouble();

			valorTipo = 4.00;
			valorTotal = valorTipo * litros;

			System.out.println("O valor total �: " + valorTotal);

			break;

		case 2:
			System.out.println("Informe quantos litros deseja abastecer: ");
			litros = sc.nextDouble();

			valorTipo = 3.20;
			valorTotal = valorTipo * litros;

			System.out.println("O valor total �: " + valorTotal);

			break;

		case 3:
			System.out.println("Informe quantos litros deseja abastecer: ");
			litros = sc.nextDouble();

			valorTipo = 2.20;
			valorTotal = valorTipo * litros;

			System.out.println("O valor total �: " + valorTotal);

			break;
		default:
			System.out.println("A op��o escolhida n�o � v�lida !");

		}
		// Fechando a classe Scanner.
		sc.close();

	}

}
