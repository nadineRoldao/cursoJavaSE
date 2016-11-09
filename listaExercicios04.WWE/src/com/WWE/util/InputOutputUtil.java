package com.WWE.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputOutputUtil {
		
	//atributos
	public final String CAMINHO_ARQUIVO = "C:/Users/Nadine/Documents";
	public final String NOME_ARQUIVO = "WWEtexto.txt";
	public final String CAMINHO_CLASSE = "";
	public final String NOME_CLASSE = "";
	
	//métodos
	public void gravarArquivo(String valor) {

		try {
			
			Path caminho = Paths.get(CAMINHO_ARQUIVO); // Recuperando o caminho onde o arquivo sera gravado
			Files.createDirectories(Paths.get(CAMINHO_ARQUIVO)); // Criando o caminho, caso ele nao exista
			Files.write(caminho, valor.getBytes()); // Gravando o arquivo efetivamente		

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String lerArquivo() {
		
		Path caminho = Paths.get(CAMINHO_ARQUIVO);
		String conteudo = null;
		
		try {
			byte[] conteudoArquivo = Files.readAllBytes(caminho);
			conteudo = new String(conteudoArquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return conteudo;
	}
	
	public void gravarClasse(Object classe) {
	}
	
	public Object lerClasse() {
		return null ;
	}

}
