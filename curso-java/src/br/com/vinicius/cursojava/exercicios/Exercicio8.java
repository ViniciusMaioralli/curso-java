package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner (System.in);
			
			double vlHora;
			
			double horasMes;
			
			double total;
			
			System.out.println("Quanto vc ganha por hora ?");
			
			vlHora = scan.nextDouble();
			
			System.out.println("Quantas horas vc trabalhou no m�s");
			
			horasMes = scan.nextDouble();
			
			total = vlHora * horasMes;
			
			System.out.println("O sal�rio �: " +total + "R$");

		}

	

}
