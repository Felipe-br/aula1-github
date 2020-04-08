package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Carro;
import entities.Proprietario;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Proprietario prop01 = new Proprietario("Felipe", "35319396880", "433465268");
		
		System.out.println("Qual sua data de nascimento?");
		String dataNasc = sc.nextLine();
		prop01.setDataNasc(dataNasc);
		
		System.out.println("Digite sua rua");
		String rua = sc.nextLine();
		prop01.setRua(rua);
		
		System.out.println("Nome : " + prop01.getNome() + "  cpf :" + prop01.getCpf() +  "  rg: " + prop01.getRg());
		
		

		
		
		
		
		sc.close();
	}

}
