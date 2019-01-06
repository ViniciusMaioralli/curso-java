package br.com.vinicius.cursojava.exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("É positivo!");
		} else {
			System.out.println("É negativo!");
		}


	}

}
