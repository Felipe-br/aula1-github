package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter conv = new CurrencyConverter();
		
		
		System.out.println("How many dollars? ");
		conv.amount = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais is = " + conv);

	}

}
