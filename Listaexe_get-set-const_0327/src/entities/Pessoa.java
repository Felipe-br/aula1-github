package entities;

public class Pessoa {
	
	private String nome;
	private int anoNasc;
	private int diaNasc;
	private int mesNasc;
	private float altura;
	
	
	
	
	public Pessoa(String nome, int anoNasc, int diaNasc, int mesNasc, float altura) {
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.diaNasc = diaNasc;
		this.mesNasc = mesNasc;
		this.altura = altura;
	}


	public void mostrarDados() {
		System.out.println();

	}
	public int calcularIdade( ) {
		return 2020 - anoNasc;
	}
	

}
