package listaDeExercicios03.exercicio08.modificadoresStatic;

public class MetodosEstaticos {

	public static void main(String[] args) {
		
		//exemplo de multiplicação com método estático
		int m = Math.multiplyExact(8, 8);
		System.out.println(m);
		
		//exemplo PI com método estático
		double pi = Math.PI;
		System.out.println(pi);
		
		//exemplo raiz quadrada com método estático
		double raiz = Math.sqrt(64);
		System.out.println(raiz);
	}
	
}
