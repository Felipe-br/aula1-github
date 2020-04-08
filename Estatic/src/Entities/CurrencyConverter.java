package Entities;

public class CurrencyConverter {
	
	public double amount;
	public double priceDollar = 3.10;

	
	public double conversao() {
		return amount * 1.06 * priceDollar;
	}

	public String toString() {
		return String.format("%.2f", conversao());
	}
}
