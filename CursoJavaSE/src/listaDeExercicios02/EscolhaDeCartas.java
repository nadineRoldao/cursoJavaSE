package listaDeExercicios02;

/**
 * nome: Escolha de cartas  data: 27/04/2016 número: 20
 * 
 * @author Nadine
 *
 */
import java.util.Random;

public class EscolhaDeCartas {

	public static void main(String[] args) {

		// menu
		System.out.println();
		System.out.println("**************************************");
		System.out.println("********* ESCOLHA DE CARTAS **********");
		System.out.println("**************************************");
		System.out.println();

		// instanciando
		Random r = new Random();

		// atribuindo informações à lista
		String[] facesBaralho = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };

		String[] nipesBaralho = { "Espadas", "Ouros", "Paus", "Copas" };

		// Pegando um valor aleatório para a face do baralho
		int posicaoFaceBaralho = r.nextInt(facesBaralho.length);

		// Pegando um valor aleatório para o nipe do baralho
		int posicaoNipeBaralho = r.nextInt(nipesBaralho.length);

		// recuperando o valor da carta.
		String carta = facesBaralho[posicaoFaceBaralho] + " de " + nipesBaralho[posicaoNipeBaralho];

		// imprimindo
		System.out.println();
		System.out.println("A carta escolhida foi: " + carta);
		System.out.println();

	}

}

