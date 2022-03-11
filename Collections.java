package br.com.ex.collections.java;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		String estoque1 = "Maça";
		String estoque2 = "Uva";
		String estoque3 = "Melão";
		String estoque4 = "Pitaia";
		String estoque5 = "Laranja";

		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);

		System.out.println(estoque);

		estoque.add(estoque5);
		System.out.println(estoque);

		estoque.remove(0);
		System.out.println(estoque);

		for(String i: estoque) {
			System.out.println();
			System.out.println("O estoque de fruta: " + i);
		}


	}

}
