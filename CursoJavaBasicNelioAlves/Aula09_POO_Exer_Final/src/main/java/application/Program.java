package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number:");
		System.out.println("Enter account holder:");
		System.out.println("Is there na initial deposit (y/n)?");
		System.out.println("Enter initial deposit value:");
		System.out.println("Account data:");
		System.out.println("Account 8532, Holder: Alex Green, Balance: $ 500.00");
		System.out.println("Enter a deposit value:");
		System.out.println("Updated account data:");
		System.out.println("Account 8532, Holder: Alex Green, Balance: $ 700.00");
		System.out.println("Enter a withdraw value:");
		System.out.println("Updated account data:");
		System.out.println("Account 8532, Holder: Alex Green, Balance: $ 395.00");
		
		
		
		sc.close();

	}

}
