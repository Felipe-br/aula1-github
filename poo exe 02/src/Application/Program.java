package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter name, gross salary and tax");
		emp.name = sc.nextLine();
		emp.grossSalary = sc.nextDouble();
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee " + emp);
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("Updated data: " + emp);
		

	}

}
