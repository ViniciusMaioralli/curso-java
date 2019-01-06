package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double raio;
		
		double circulo;
		
		double area;
		
		
		System.out.println("Informe o raio: ");
		
		raio = scan.nextDouble();
		
		circulo = 2 * 3.14 * raio;
		
		System.out.println("Raio do circulo: " +circulo);
		
		area = 3.14 * raio * raio;
		
		System.out.println("A área é: " +area);

	}

}
