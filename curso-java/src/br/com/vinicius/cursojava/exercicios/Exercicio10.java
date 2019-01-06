package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double tC;
		
		double tF;
		
		System.out.println("Digite a temperatura em Celsius: ");
		
		tC = scan.nextDouble();
		
		tF = (tC/ 5) * 9 + 32;
		

		System.out.println("A temperatura em Fahrenheit é: " +tF + "ºF");

	}

}
