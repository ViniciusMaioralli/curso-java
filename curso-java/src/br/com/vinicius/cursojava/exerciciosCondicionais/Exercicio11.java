package br.com.vinicius.cursojava.exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		
		double salario = scan.nextDouble();
		
		double reaj;
		
		double total;
		
		System.out.println("Salário antes do reajuste: " +salario);
		
		if(salario <= 280){
			reaj = salario * 0.20;
			System.out.println("Reajuste de: " +reaj);
			total = reaj + salario;
			System.out.println("Salario com aumento de 20%: " +total);
		
		}else if(salario >= 280 && salario <= 700){
			reaj = salario * 0.15;
			System.out.println("Reajuste de: " +reaj);
			total = reaj + salario;
			System.out.println("Salário com aumento de 15%: " +total);
		}else if(salario >= 700 && salario <= 1500){
			reaj = salario * 0.10;
			System.out.println("Reajuste de: " +reaj);
			total = salario + reaj;
			System.out.println("Salário com aumento de 10%: " +total);
		}else if(salario > 1500){
			reaj = salario * 0.05;
			System.out.println("Reajuste de: " +reaj);
			total = reaj + salario;
			System.out.println("Salário com aumento de 5%: " +total);
		}

	}

	

}
