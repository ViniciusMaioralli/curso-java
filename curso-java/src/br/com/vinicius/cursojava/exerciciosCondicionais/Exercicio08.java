package br.com.vinicius.cursojava.exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço dos produtos: ");
		
		double prod1 = scan.nextDouble();
		
		double prod2 = scan.nextDouble();
		
		double prod3 = scan.nextDouble();
		
		if (prod1 <= 10 || prod2 <=10 || prod3 <= 10 ) {
			System.out.println("Barato, pode comprar");
			
		}else if(prod1 > 10 && prod1 <= 20|| prod2 > 10 && prod2 <= 20 || prod3 > 10 && prod3 <= 20) {
			System.out.println("Pode achar mais barato");
			
		}else if(prod1 > 20 && prod1 <= 30|| prod2 > 20 && prod2 <= 30 || prod3 > 20 && prod3 <= 30) {
			System.out.println("Muito caro !");
		}

	}

}
