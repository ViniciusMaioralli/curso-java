package br.com.vinicius.cursojava.exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		
		int n1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		
		int n2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		
		int n3 = scan.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior �: "+n1);
			
		} else if(n2 > n1 && n2 > n3){
			System.out.println("O maior �: " +n2);
			
		} else if(n3 > n2 && n3 > n1) {
			System.out.println("O maior �: " +n3);
		}
		
		if(n3 < n2 && n3 < n1) {
			System.out.println("O menor �: " +n3);
			
		}else if(n2 < n3 && n2 < n1) {
			System.out.println("O menor �: " +n2);
			
		} else if(n1 < n2 && n1 < n3) {
			System.out.println("O menor �: " +n1);
		}	


	}

}
