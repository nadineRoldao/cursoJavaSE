package listaDeExercicios03.exercicio14.cruid;

import java.util.Random;

public class EscolaUtil {

	private static Random r = new Random();
	
	//a)
	public static int gerarID(){
		
		return r.nextInt(1000);
	}
	
}
