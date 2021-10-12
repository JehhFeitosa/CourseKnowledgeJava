package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAndScanner {
	
	public static void main(String[] args) {
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc= new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error> " + e.getLocalizedMessage());
		}
		finally {
			if(sc != null) { 
			sc.close();
			}
		}
	}

}
