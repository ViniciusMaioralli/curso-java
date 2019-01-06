package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double quadrado;
		
		double area;
		
		double dobro;
		
		System.out.println("Informe o lado do quadrado: ");
		
		quadrado = scan.nextDouble();
		
		area = quadrado * quadrado;
		
		System.out.println("Área: " +area);
		
		dobro = area * 2;
		
		System.out.println("Dobro: " +dobro);
	}

}
