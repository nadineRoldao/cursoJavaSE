package listaDeExercicios04.exercicio02.polimorfismo;

import java.util.Random;

public class WWEutil  {

	public static int getRandomicNumber(){
		Random r = new Random();
		return r.nextInt(10);
	}
	
	public boolean isPair(int n) {
		return n % 2 == 0;
		
	}
}
