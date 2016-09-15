package aula40.IO_InputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo01 {

	public static void main(String[] args) throws IOException {
		
		Path caminho = Paths.get("C:/Users/Nadine/workspace/JAVA/projetos/cursoJavaSE2/CursoJavaSE/src/aula40/IO_InputOutput/texto.txt");
		System.out.println(caminho.toAbsolutePath());
		System.out.println(caminho.getParent());
		System.out.println(caminho.getRoot());
		System.out.println(caminho.getFileName());
		
		//Files.createDirectories(Paths.get("C:/Users/Nadine/workspace/JAVA/projetos/cursoJavaSE2/CursoJavaSE/src/aula40/IO_InputOutput/pastaCriadaViaJava"));
		
		String raw = "anda logo que o RAW ja vai comecar";
		
		Files.write(caminho, raw.getBytes());
		
		byte[] texto = Files.readAllBytes(caminho);
		System.out.println(new String(texto));
	}
	
	
}
