package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite seu nome");
		student.name = sc.next();
		System.out.println("Digite a sua nota 1");
		student.grade1 = sc.nextDouble();
		System.out.println("Digite a sua nota 2");
		student.grade2 = sc.nextDouble();
		System.out.println("Digite a sua nota 3");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
		
		
	}

	
	
	
	
	
	
}
