package listaDeExercicios01;

import java.util.Scanner;

public class ExercicioScanner {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double numero01;
		double numero02;
		double numero03;
		double numero04;
		double resultado;

		System.out.println("Informe a nota do primeiro bimestre: ");
		numero01 = sc.nextDouble();

		System.out.println("Informe a nota do segundo bimestre: ");
		numero02 = sc.nextDouble();

		System.out.println("Informe a nota do terceiro bimestre: ");
		numero03 = sc.nextDouble();

		System.out.println("Informe a nota do quarto bimestre: ");
		numero04 = sc.nextDouble();

		resultado = numero01 + numero02 + numero03 + numero04 / 4;

		System.out.println("Media nota escolar: " + resultado);
		
		sc.close();
	}

}
