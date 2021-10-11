package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		System.out.println("Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		
		System.out.println("Check-out date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next());
		
		
		Reservation reservation = new Reservation(number, checkin, checkout);
		System.out.println("Reservation: " + reservation);
			
		System.out.println();
		System.out.println("Enter data to update the reservation: ");
		checkin = sdf.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy): ");
		checkout = sdf.parse(sc.next());

		reservation.updateDates(checkin, checkout);
		System.out.println("Reservation: " + reservation);
		
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		}catch(DomainException domain) {
			System.out.println("Error in reservation: " + domain.getMessage());		
		}catch(RuntimeException r) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
		
		
	}

}
