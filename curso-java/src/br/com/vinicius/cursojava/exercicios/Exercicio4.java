package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		double media;
		
		double notaBim1, notaBim2, notaBim3, notaBim4;
		
				
				System.out.println("Informe a nota do 1º bim: " );
				notaBim1 = scan.nextDouble();
				
				System.out.println("Informe a nota do 2º bim: " );
				notaBim2 = scan.nextDouble();
				
				System.out.println("Informe a nota do 3º bim: " );
				notaBim3 = scan.nextDouble();
				
				System.out.println("Informe a nota do 4º bim: " );
				notaBim4 = scan.nextDouble();
				
				media = (notaBim1 + notaBim2 + notaBim3 + notaBim4) / 4;
				
				System.out.println("A média é: " +media);
			
			}

	}


