package br.com.vinicius.cursojava.exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		
		double nota = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		
		double nota2 = scan.nextDouble();
		
		double media;
		
		media = (nota + nota2) / 2;
		
		if(media >= 7 && media <= 9) {
			System.out.println("Aprovado !");
		} else if(media < 7) {
			System.out.println("Reprovado !");
		}else if(media == 10) {
			System.out.println("Aprovado com distinção !");
		}


	}

}
