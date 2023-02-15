package Application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] Args){
		
		// estancia o arquivo txt com a biblioteca 'File'.
		File file = new File("C:\\Users\\nitro\\Desktop\\nomes.txt");
		// cria um Scanner com o valor nulo
		Scanner sc = null;
		// inicia o tratamento 'try' para a exceção IOException.
		try {
			// define que o  irá ler o arquivo TXT.
			sc = new Scanner(file);
			// cria um laço para ler os dados dentro do arquivo txt.
			while(sc.hasNextLine()) {
				// imprime no console os dados dentro do arquivo.
				System.out.println(sc.nextLine());
			}
		}
		// trata a exceção IOException imprimindo a mensagem de erro.
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		// se encarrega de feixar o metodo scanner ao finalizar o codigo.
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}
}
