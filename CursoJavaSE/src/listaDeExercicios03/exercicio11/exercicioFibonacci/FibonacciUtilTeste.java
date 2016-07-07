package listaDeExercicios03.exercicio11.exercicioFibonacci;

import java.util.ArrayList;

public class FibonacciUtilTeste {

	public static void main(String[] args) {
		
		System.out.println("SEQUÊNCIA FIBONACCI: ");
		ArrayList<Integer> resultadoFibonacci01 = FibonacciUtil.sequenciaFibonacci(8);
		for(Integer i : resultadoFibonacci01){
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println("ENESIMA SEQUÊNCIA FIBONACCI: ");
		int resultadoFibonacci02 = FibonacciUtil.enesimaSequencia(83);
		System.out.println(resultadoFibonacci02);
		
		System.out.println();
		
		System.out.println("POSIÇÃO SEQUÊNCIA FIBONACCI: ");
		ArrayList<Integer> resultadoFibonacci03 = FibonacciUtil.valoresFibonacci(9);
		for(Integer i : resultadoFibonacci03 ){
			System.out.println(i);
		}
	}
	
}
