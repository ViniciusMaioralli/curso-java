package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double celsius;
		
		double fahrenheit;
		
		System.out.println("Digite os graus em F");
		
		fahrenheit = scan.nextDouble();
		
		celsius = (5 * (fahrenheit - 32) /9);
		
		System.out.println("A tempeatura em graus Celsius é: " +celsius + "ºC");

	}

}
