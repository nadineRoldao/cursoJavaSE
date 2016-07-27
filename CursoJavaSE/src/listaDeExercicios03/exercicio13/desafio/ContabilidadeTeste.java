package listaDeExercicios03.exercicio13.desafio;

import java.util.ArrayList;

public class ContabilidadeTeste {
	
	public static void main(String[] args) {
		
		Trabalhador t1 = new Trabalhador("Roman Reigns", 'M', 31, TipoTrabalhador.TI, 18, 6);
		Trabalhador t2 = new Trabalhador("Sami Zayn", 'M', 32, TipoTrabalhador.GERENTE, 19, 4);
		Trabalhador t3 = new Trabalhador("Trash Rollins", 'M', 28, TipoTrabalhador.ATENDENTE, 20, 6);
		Trabalhador t4 = new Trabalhador("Sasha Banks", 'F', 24, TipoTrabalhador.TI, 2, 3);
		Trabalhador t5 = new Trabalhador();
		t5.setNome("Kevin Owens");
		t5.setSexo('M');
		t5.setIdade(32);
		t5.setTipoTrabalhador(TipoTrabalhador.ATENDENTE);
		t5.setId(11);
		t5.setTempoTrabalhoEmAnos(3);
		
		ArrayList<Trabalhador> trabalhadores = new ArrayList<>();
		trabalhadores.add(t1);
		trabalhadores.add(t2);
		trabalhadores.add(t3);
		trabalhadores.add(t4);
		trabalhadores.add(t5);
		
		Contabilidade c = new Contabilidade("Raw", trabalhadores);
		
		System.out.println("**********FOLHA DE PAGAMENTO********** ");
		double total = c.folhaPagamento();
		System.out.println(total);
		//mesma coisa
		System.out.println(c.folhaPagamento());
		System.out.println();
		
		System.out.println("**********LISTA DE QUEM TRABALHA A MAIS DE 5 ANOS********** ");
		System.out.println(c.getListaTrabMais5Anos());
		System.out.println();
		//MESMA COISA
		ArrayList<String> lista5anos = c.getListaTrabMais5Anos();
		for(String s : lista5anos){
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("**********ACHANDO O TRABALHADOR PELO ID DELE********** ");
		Trabalhador t = c.getTrabalhador(18);
		System.out.println(t.getNome());
		System.out.println(t.getIdade());
		System.out.println(t.getTipoTrabalhador());
		
		System.out.println();
		System.out.println("**********LISTA DE FUNCIONÁRIOS********** ");
		c.listarFuncionarios();
		System.out.println();
		
		System.out.println(c.getTotalFuncionarios());
	}

}
