package Entities;

public class Conta {
	
	private int numConta;
	private String nome;
	private double saldo;
	
	
	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}
	
	public Conta(int numConta, String nome, double saldo) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
	}


	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}

	
	
	
	
}
