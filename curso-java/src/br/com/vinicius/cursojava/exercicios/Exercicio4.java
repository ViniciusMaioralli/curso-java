package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		double media;
		
		double notaBim1, notaBim2, notaBim3, notaBim4;
		
				
				System.out.println("Informe a nota do 1� bim: " );
				notaBim1 = scan.nextDouble();
				
				System.out.println("Informe a nota do 2� bim: " );
				notaBim2 = scan.nextDouble();
				
				System.out.println("Informe a nota do 3� bim: " );
				notaBim3 = scan.nextDouble();
				
				System.out.println("Informe a nota do 4� bim: " );
				notaBim4 = scan.nextDouble();
				
				media = (notaBim1 + notaBim2 + notaBim3 + notaBim4) / 4;
				
				System.out.println("A m�dia �: " +media);
			
			}

	}


