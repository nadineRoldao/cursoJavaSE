package listaDeExercicios01;

public class ExercicioMedia {
	
public static void main(String[] args) {
		
		Scanner lerInformacao = new Scanner(System.in);

		double nota01;
		double nota02;
		double nota03;
		double nota04;
		double media;

		System.out.println("Informe a nota do primeiro bimestre: ");
		nota01 = lerInformacao.nextDouble();

		System.out.println("Informe a nota do segundo bimestre: ");
		nota02 = lerInformacao.nextDouble();

		System.out.println("Informe a nota do terceiro bimestre: ");
		nota03 = lerInformacao.nextDouble();

		System.out.println("Informe a nota do quarto bimestre: ");
		nota04 = lerInformacao.nextDouble();

		media = (nota01 + nota02 + nota03 + nota04) / 4;

		System.out.println("Media nota escolar: " + media);

		String resultadoMedia = (media > 5) ? "Passou" : "Nao Passou";

		System.out.println("Passou? " + resultadoMedia);
	}

}
