package br.com.vinicius.cursojava.aula14;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		/*System.out.println("Digite sua idade: ");
		
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			
		System.out.println("� maior de idade");
		
		} else {
			
		System.out.println("N�o � maior de idade.");
		}*/
		
		//barato <= 10
		//10 < valor < 15 - pedir desconto
		//15 <= valor 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.println("Entre com pre�o do item");
		
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Est� barato, pode comprar");
			
		} else if (valor > 10 && valor < 15) {
			System.out.println("Voc� pode pedir um desconto");
			
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
			
			// Obs: pode comentar o else pq � opcional aparecer ou n�o.
		} else { // valor >= 17
			System.out.println("Muito caro !");
		}
	}

	

}
