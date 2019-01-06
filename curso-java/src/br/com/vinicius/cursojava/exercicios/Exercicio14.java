package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do arquivo para download");
		
		double arquivo;
		
		double vLink;
		
		double tempo;
		
		arquivo = scan.nextDouble();
		
		System.out.println("Qual a velocidade do link");
		
		vLink = scan.nextDouble();
		
		tempo = arquivo / vLink;
		
		System.out.println("A taxa de transferencia em minutos é: " +tempo);

	}

}
