package br.com.vinicius.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// L� uma linha inteira
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: "+ nomeCompleto);
		
		//L� um tipo de dados especificos
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: "+ primeiroNome);
		*/
		
		//L� um inteiro
		//System.out.println("Digite sua idade: ");
		//int idade = scan.nextInt();
		//System.out.println("Sua idade �: " + idade);
		
		/*System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura �: " + altura); */
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bicho de estima��o");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		int quantidadeDeFilhos = scan.nextInt();
		double altura = scan.nextDouble();
		boolean bichoDeEstimacao = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("nome: " + primeiroNome);
		System.out.println("idade: "+ idade);
		System.out.println("filhos: "+ quantidadeDeFilhos);
		System.out.println("altura: "+ altura);
		System.out.println("pet: "+ bichoDeEstimacao);
		
	}

}
