package exercicioArray;

import java.util.ArrayList;
import java.util.List;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int [6];
		
		a [0] = 1;
		a [1] = 0;
		a [2] = 5;
		a [3] = -2;
		a [4] = 100;
		a [5] = 7;
		
		int soma = a[0] + a[1] + a[5];
		
		System.out.println("Soma: "+ soma);
		
		for (int i = 0; i< a.length; i++) {
			System.out.println( i + " " + a[i]);
		}
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(0);
		list.add(5);
		list.add(-2);
		list.add(100);
		list.add(7);
		
		System.out.println(list.size());
		for (Integer x : list) {
			System.out.println(x);
		}
	}

}
