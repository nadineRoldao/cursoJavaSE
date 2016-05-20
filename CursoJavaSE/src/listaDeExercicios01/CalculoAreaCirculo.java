package listaDeExercicios01;

import java.util.Scanner;

public class CalculoAreaCirculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor do raio: ");
		double raio = sc.nextDouble();
		final Double PI = 3.14159265359;
		double resultado = PI * (raio * raio);
		System.out.println("A area do circulo: " + resultado);

		sc.close();
	}

}
