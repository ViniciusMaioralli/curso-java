package br.com.vinicius.cursojava.exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite uma letra: ");
		
		int vogal = scan.nextInt();
		
		switch(vogal) {
		
		case 1: System.out.println("A"); break;
		
		case 2: System.out.println("E"); break;
		
		case 3: System.out.println("I"); break;
		
		case 4: System.out.println("O"); break;
		
		case 5: System.out.println("U"); break;
		
		default: System.out.println("É uma consoante !");
		}


	}

}
