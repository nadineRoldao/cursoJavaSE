package listaDeExercicios02;

/**
 * nome: Cálculo Combustivél data: 27/04/2016 número: 18
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

		// Declração de variáveis
		double valorTipo;
		double litros;
		double valorTotal;

		System.out.println("Digite o tipo do combustível: ");
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

			System.out.println("O valor total é: " + valorTotal);

			break;

		case 2:
			System.out.println("Informe quantos litros deseja abastecer: ");
			litros = sc.nextDouble();

			valorTipo = 3.20;
			valorTotal = valorTipo * litros;

			System.out.println("O valor total é: " + valorTotal);

			break;

		case 3:
			System.out.println("Informe quantos litros deseja abastecer: ");
			litros = sc.nextDouble();

			valorTipo = 2.20;
			valorTotal = valorTipo * litros;

			System.out.println("O valor total é: " + valorTotal);

			break;
		default:
			System.out.println("A opção escolhida não é válida !");

		}
		// Fechando a classe Scanner.
		sc.close();

	}

}
