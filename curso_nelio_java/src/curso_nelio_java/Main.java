package curso_nelio_java;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		
		
		System.out.println("Enter rectangle width and height");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.println("Area = " + rect.area());
		System.out.println("Perimeter = " + rect.perimetrer());
		System.out.println("Diagonal = " + rect.diagonal());
		
		
		

	}

}
