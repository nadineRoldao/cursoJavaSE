package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exeptions {
	
	static String[] nomes;
	
	public static void main(String[] args) {
		
		try {
			
			simulaNullPointer();
			
			simulaInputMismatchException();
			
			simulaArithmeticException();
			
		} catch (InputMismatchException e) {
			System.out.println("vc só pode inserir numeros");
		} catch (ArithmeticException e) {
			System.out.println("em java nao podemos dividir um numero por zero");
		} finally {
			System.out.println("Esse bloco sempre é executado");
		}
		
	}
	
	public static void simulaNullPointer() {
		System.out.println(nomes.length);
	}
	
	public static void simulaInputMismatchException() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o numero: ");
		int n = sc.nextInt();
		System.out.println("Informe o divisor: ");
		int d = sc.nextInt();
		System.out.println(n / d);
		sc.close();
	}
	
	public static void simulaArithmeticException() {
		System.out.println(10 / 0);
	}
	
}
