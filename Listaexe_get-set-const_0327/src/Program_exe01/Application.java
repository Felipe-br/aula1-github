package Program_exe01;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite nome, ano de nascimento, dia de nascimento, mes de nascimento, altura");
		String nome = sc.nextLine();
		int ano = sc.nextInt();
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		float altura = sc.nextFloat();
		
		Pessoa pe01 = new Pessoa(nome,ano,dia,mes,altura);
		
		System.out.println(pe01.calcularIdade());
		
		
	}

}
