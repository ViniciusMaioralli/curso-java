package br.com.vinicius.cursojava.exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int n1 = scan.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		
		int n2 = scan.nextInt();
		
		if(n1 > n2) {
			System.out.println("O maior �: " +n1);
		} else {
			System.out.println("O maior �: " +n2);
		}

	


	}

}
