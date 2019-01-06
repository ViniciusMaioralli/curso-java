package br.com.vinicius.cursojava.exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual período você estuda ?");
		
		String turno = scan.nextLine();
		
		if(turno.equals("M") || turno.equals("m")) {
			System.out.println("Bom dia !");
			
		}else if(turno.equals ("V")|| turno.equals("v")) {
			System.out.println("Boa tarde !");
			
		}else if(turno.equals("N")|| turno.equals("n")) {
			System.out.println("Boa noite !");
			
		}else {
			System.out.println("Valor inválido !");
		}

	}

}
