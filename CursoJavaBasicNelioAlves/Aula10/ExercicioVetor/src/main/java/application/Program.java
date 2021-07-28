package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

//Vetores com Classes
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quartos = 9;
		
		System.out.println("Bem vindos a pensão da Tia Cool");
		System.out.println("No momento, temos "+ quartos+ " quartos disponieis.");
		System.out.println("Digite o número de estudantes que irão alugar quartos...");
		
		int n = sc.nextInt();
		Aluguel[] vect = new Aluguel[quartos];
		
		System.out.println("Agora, digite o nome e email de cada estudante.");
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			vect[i] = new Aluguel(name, email);
		}
		
		
//		for (int i=0; i<quartos; i++) {
//			for (int j=0; i<Aluguel.size(); i++) {
//			System.out.println(Aluguel(j));
//			}
//		}
				
		
		sc.close();
		
		
		
	}

}
