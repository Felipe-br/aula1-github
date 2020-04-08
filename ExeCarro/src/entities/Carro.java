package entities;

public class Carro {
	
	private String modelo;
	private String cor;
	private String ano;
	private String marca;
	private String chassi;
	private String proprietário;
	private double veloMax;
	private double veloAtual;
	private int numPortas;
	private boolean tetoSolar;
	private int numMarchas;
	private boolean cambioAutom;
	private double volumeCombustivel;
	
	
	
	public Carro () {
		
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getProprietário() {
		return proprietário;
	}
	public void setProprietário(String proprietário) {
		this.proprietário = proprietário;
	}
	public double getVeloMax() {
		return veloMax;
	}
	public void setVeloMax(double veloMax) {
		this.veloMax = veloMax;
	}
	public double getVeloAtual() {
		return veloAtual;
	}
	public void setVeloAtual(double veloAtual) {
		this.veloAtual = veloAtual;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public boolean isTetoSolar() {
		return tetoSolar;
	}
	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	public int getNumMarchas() {
		return numMarchas;
	}
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	public boolean isCambioAutom() {
		return cambioAutom;
	}
	public void setCambioAutom(boolean cambioAutom) {
		this.cambioAutom = cambioAutom;
	}
	public double getVolumeCombustivel() {
		return volumeCombustivel;
	}
	public void setVolumeCombustivel(double volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}
	
	
				
		public void acelera() {
			double veloNova = this.veloAtual + 1;
			this.veloAtual = veloNova;
		}
		
		public void pararCarro() {
			veloAtual = 0;
			System.out.println("Vlocidade = " + veloAtual + "Km/h");
		}
		
		public void trocarMarcha(int marcha ) {
			if (marcha ==1) {
				System.out.println("Primeira");
				
			}
			else if
				(marcha ==2) {
				System.out.println("Segunda");
			}
			else if
				(marcha ==3) {
				System.out.println("terceira");
			}
			else if 
				(marcha == 0) {
				System.out.println("Ré");
			}
		}
		
		public   double calcularAutonomia(double distancia, double quantComb) {
		return distancia/quantComb;	
		}
		
		
	

}
