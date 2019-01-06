package br.com.vinicius.cursojava.exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um Gênero: ");
		
		String genero = scan.nextLine();
		
		if(genero.equals("m")|| genero.equals("M")) {
			System.out.println("Masculino");
			
		}else if(genero.equals("f")|| genero.equals("F")) {
			System.out.println("Feminino");
		}

	}

}
