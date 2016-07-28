package listaDeExercicios03.exercicio14.cruid;

public class EscolaTeste {

	public static void main(String[] args) {
		
		Endereco e = new Endereco("5546-445", Logradouro.RUA, "João da Couves", 14, "São Paulo", "São Paulo", "bloco 5");
		Endereco ed = new Endereco("02343-030", Logradouro.RUA, "Mere Marie Anais de Sion", 472, "São Paulo", "São Paulo", "apto.8");
		
		Escola ec = new Escola(null, "colegio sao paulo", e);
		ec.adicionarAluno("Julia", 14, ed, true);
		ec.adicionarAluno("Nadine", 13, e, false);
		
		int codigoAluno = ec.getAlunos().get(0).getCodigoAluno();
		
		ec.atualizarEnderecoAluno(codigoAluno, e);
		
		ec.alunosMatricula();
		
		ec.removerAluno(codigoAluno);
		
		
	}
	
}
