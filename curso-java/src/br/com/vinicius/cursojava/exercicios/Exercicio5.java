package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double metros;
		
		double centimetros;
		
		System.out.println("Informe os metros");
		
		metros = scan.nextDouble();
	
		centimetros = metros * 100;
		 
		System.out.println("A conversão é: " + centimetros + "cm"); 
		
	}

}
