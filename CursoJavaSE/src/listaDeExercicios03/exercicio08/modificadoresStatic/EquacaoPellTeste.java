package listaDeExercicios03.exercicio08.modificadoresStatic;

import java.util.Scanner;

public class EquacaoPellTeste {
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
	
			System.out.println("Informe um numero para saber a raiz quadrada por meio da equação de pell:");
			int valor = sc.nextInt();
			
			String resultado = EquacaoPell.calcularEquacaoPell(valor);
			System.out.println(resultado);
			sc.close();
			
		}
}
