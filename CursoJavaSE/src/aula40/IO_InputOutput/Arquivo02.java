package aula40.IO_InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo02 {

	public static void main(String[] args) {
		
		Path caminho = Paths.get("C:/Users/Nadine/aulaIO/meuArquivoWord.doc");
		
		Charset utf8 = StandardCharsets.UTF_8;
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			Files.createDirectories(Paths.get("C:/Users/Nadine/aulaIO"));
			bw = Files.newBufferedWriter(caminho, utf8);
			//esquevendo no arquivo
			bw.write("tralvhjksudk \n");
			bw.write("hgiwhgvontdfngd \n");
			bw.close();
			
			br = Files.newBufferedReader(caminho,utf8);
			String linha = null;
			while((linha = br.readLine()) != null){
				System.out.println(linha);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
