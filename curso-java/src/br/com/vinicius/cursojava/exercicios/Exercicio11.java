package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		
		int nInteiro;
		
		double r;
		
		int nInteiro2;
		
		double nDecimal;
		
		nInteiro = scan.nextInt();
		
		System.out.println("Digite outro numero inteiro: ");
		
		nInteiro2 = scan.nextInt();
		
		System.out.println("Digite um numero decimal: ");
		
		nDecimal = scan.nextDouble();
		
		// a
		
		r = 2 * nInteiro * (nInteiro2/2);
		
		System.out.println("R: " +r);
		
		//b 
		
		 r= 3 * nInteiro + nDecimal;
		 
		 System.out.println("R: " +r);
		 
		 //c
		 r = nDecimal * nDecimal * nDecimal;
		 
		 System.out.println("R: " +r);

	}

}
