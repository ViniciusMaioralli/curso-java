package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		
		double altura;
		
		double r;
		
		altura = scan.nextDouble();
		
		r = (72.7 * altura) - 58;
		
		System.out.println("Peso ideal: " +r);
		

	}

}
