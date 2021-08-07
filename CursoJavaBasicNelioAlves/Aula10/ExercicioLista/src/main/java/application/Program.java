package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		//Read 1 number N and then the data (id, name and salary) of N employees
		System.out.println("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++){
			
			//Print on the screen which is the employee
			System.out.println();
			System.out.println("Employee #" + (i+1)+ ":");
			System.out.println("id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			//clear buffer entry
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			//instantiating the employee class
			Employee emp = new Employee(id, name, salary);
			
			//add to list
			list.add(emp);
		}
		
		//Increase a given employee's salary by X percent
		System.out.println("Enter the employee id that will have salary increase : ");
		int idSalary = sc.nextInt();
			
		//if it doesn't exist
		Integer pos = position(list, idSalary);
		if(pos == null) {
			System.out.println("This id doesn't exist! ");
		}
		//if yes add raise
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		//for each employee to print data
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	
	
	//helper function to search element in list
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i< list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	

	

}
