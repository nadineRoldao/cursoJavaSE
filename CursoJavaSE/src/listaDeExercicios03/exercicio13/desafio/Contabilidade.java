package listaDeExercicios03.exercicio13.desafio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contabilidade implements Serializable{
	
	//implementando a interface serializable
	private static final long serialVersionUID = 1L;
	
	//atributos
	private String nomeEmpresa;
	private List<Trabalhador> trabalhadores;
	
	//construtor auxiliar
	public Contabilidade(String nomeEmpresa, List<Trabalhador> trabalhadores){
		
		this.nomeEmpresa = nomeEmpresa;
		if (trabalhadores == null) {
			this.trabalhadores = new ArrayList<Trabalhador>();
		}else{
			this.trabalhadores = trabalhadores;
		}
		
	}

	// a)
	public double folhaPagamento(){
		double valorSalarios = 0.0;
		
		for(Trabalhador t : trabalhadores){
			if (t.getTipoTrabalhador() == TipoTrabalhador.ATENDENTE) {
				valorSalarios += 900.00 + (100.00 * t.getTempoTrabalhoEmAnos());
			}else if(t.getTipoTrabalhador() == TipoTrabalhador.GERENTE){
				valorSalarios += 2000.00 + (200.00 * t.getTempoTrabalhoEmAnos());
			}else{
				valorSalarios += 2500.00 + (250.00 * t.getTempoTrabalhoEmAnos());
			}
		}
		
		return valorSalarios;
	}
	
	// b)
	public ArrayList<String> getListaTrabMais5Anos(){
		
		ArrayList<String> lista = new ArrayList<>();
		
		for(Trabalhador tb : trabalhadores){
			if (tb.getTempoTrabalhoEmAnos() > 5) {
				lista.add("Nome: " + tb.getNome() + " - ID: " + tb.getId());
			}
		}
		
		return lista;
	}
	
	// c)
	public Trabalhador getTrabalhador(int id){
		
		for(Trabalhador tbld : trabalhadores){
			if (tbld.getId() == id) {
				return tbld;
			}
		}
		
		return null;
	}
	
	// d)
	public void listarFuncionarios(){
		for(Trabalhador tbldr : trabalhadores){
			System.out.println("Nome: " + tbldr.getNome());
			System.out.println("Sexo: " + tbldr.getSexo());
			System.out.println("Idade: " + tbldr.getIdade());
			System.out.println("Tipo de trabalhador: " + tbldr.getTipoTrabalhador());
			System.out.println("ID: " + tbldr.getId());
			System.out.println("Tempo de trabalho em anos" + tbldr.getTempoTrabalhoEmAnos());
			System.out.println();
			System.out.println();
		}
	}
	
	// e)
	public int getTotalFuncionarios(){
		return trabalhadores.size();
	}
	
	// Getters and Setters
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public List<Trabalhador> getTrabalhadores() {
		return trabalhadores;
	}
	
	public void setTrabalhadores(List<Trabalhador> trabalhadores) {
		this.trabalhadores = trabalhadores;
	}
}
