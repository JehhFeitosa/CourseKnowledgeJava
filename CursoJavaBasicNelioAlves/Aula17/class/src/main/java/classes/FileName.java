package classes;

import java.io.File;
import java.util.Scanner;

public class FileName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file path: ");
		String strPath = sc.nextLine();
		
		//BUSCANDO O NOME DO ARQUIVO
		File path = new File(strPath);
		
		//Buscando só o nome do arquivo
		System.out.println("getName: " + path.getName());
		//Buscando só o caminho do diretorio sem o nome do arquivo
		System.out.println("getParent: " + path.getParent());
		//Buscando o nome do caminho completo
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
		
	}

}
