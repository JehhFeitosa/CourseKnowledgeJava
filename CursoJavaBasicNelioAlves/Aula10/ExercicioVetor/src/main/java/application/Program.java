package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

//Vetores com Classes
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.println("Bem vindos a pensão da Tia Cool");
		System.out.println("Digite o número de estudantes que irão alugar quartos...");
		
		int n = sc.nextInt();
		
		System.out.println("Agora, digite o nome e email de cada estudante.");
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Aluguel(name, email);
			}
			System.out.println();
			System.out.println("Busy rooms:");
			for (int i=0; i<10; i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
			}
				
		
		sc.close();
		
		
		
	}

}
