package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Students;

public class Array {
	
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Students[] vect = new Students[10];
		
		System.out.println("quantos quartos deseja alugar?");
		int n = sc.nextInt();
		
		
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("name: ");		
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email= sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Students(name,email);
			
		}
		System.out.println();
		System.out.println("Busy rooms");
		for (int i=0; i<10;i++) {
			if (vect[i] != null) {
				System.out.println(i + " : " + vect[i]);
			}
		}

		
		
		sc.close();
	}

}
