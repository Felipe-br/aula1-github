package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite nome e as 3 notas ");
		aluno.name = sc.nextLine();
		aluno.priTrimestre = sc.nextDouble();
		aluno.segTrimestre = sc.nextDouble();
		aluno.terTrimestre = sc.nextDouble();
		
		System.out.println("Nota Final " + aluno.somaNota());
		
		if (aluno.somaNota() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING POINTS " + aluno.missingPoints());
			
		}

		else {
			System.out.println("APROVADO");
		}
		
		sc.close();
	}
	

}
