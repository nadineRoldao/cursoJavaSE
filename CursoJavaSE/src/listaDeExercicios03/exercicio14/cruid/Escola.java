package listaDeExercicios03.exercicio14.cruid;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Escola implements Serializable {

	// implementando a interface serializable
	private static final long serialVersionUID = 1L;

	// atributos da classe Escola
	private List<Aluno> alunos;
	private String nomeEcola;
	private Endereco endereco;
	private static int totalAlunos;

	// construtor auxiliar
	public Escola(List<Aluno> alunos, String nomeEcola, Endereco endereco) {
		if (alunos == null) {
			alunos = new ArrayList<Aluno>();
		}

		this.alunos = alunos;
		this.nomeEcola = nomeEcola;
		this.endereco = endereco;
	}

	// b) Create
	public void adicionarAluno(String nome, int idade, Endereco endereco, boolean statusMatricula) {

		Aluno aluno = new Aluno();

		int id = EscolaUtil.gerarID();
		
		
		while(pesquisarAluno(id)!= null){
			id = EscolaUtil.gerarID();
		}
		
		aluno.setNome(nome);
		aluno.setCodigoAluno(id);
		aluno.setIdade(idade);
		aluno.setEndereco(endereco);
		aluno.setStatusMatricula(statusMatricula);

		alunos.add(aluno);
		System.out.println("ALUNO ADICIONADO COM SUCESSO!!");

	}

	// c) Delete
	public void removerAluno(int codigoAluno ) {
		//mesma coisa v
		//alunos.remove(pesquisarAluno(codigoAluno));
		
		Aluno aluno = pesquisarAluno(codigoAluno);
		alunos.remove(aluno);
		System.out.println("aluno removido com sucesso!");
	}

	// d)
	public Aluno pesquisarAluno(int id) {

		for(Aluno a : alunos){
			if (a.getCodigoAluno() == id) {
				return a;
			}
		}
		return null;
	}

	// e)
	public void atualizarEnderecoAluno(int idAluno, Endereco endereco) {

		Aluno aluno = pesquisarAluno(idAluno);
		alunos.remove(aluno);
		aluno.setEndereco(endereco);
		alunos.add(aluno);
		System.out.println("endereço atualizado com sucesso!!");
	}

	// f)
	public void alunosMatricula() {

		int matriculados = 0;
		int naoMatriculados = 0;
		
		for(int i = 0; i < alunos.size(); i++){
			if (alunos.get(i).isStatusMatricula()) {
				matriculados++;
			}else{
				naoMatriculados++;
			}
		}
		System.out.println("****MATRICULADOS****");
		System.out.println(matriculados);
		
		System.out.println("****NÃO MATRICULADOS****");
		System.out.println(naoMatriculados);
		
	}

	// Getters and Setters
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String getNomeEcola() {
		return nomeEcola;
	}

	public void setNomeEcola(String nomeEcola) {
		this.nomeEcola = nomeEcola;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static int getTotalAlunos() {
		return totalAlunos;
	}

	public static void setTotalAlunos(int totalAlunos) {
		Escola.totalAlunos = totalAlunos;
	}

}
