package br.com.vinicius.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta �";
		String segundoNome = " uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		//5
		System.out.println(resultado++); // pede primeiro o valor do resultado e dps add 1
		// mesma coisa que 
		//System.out.println(resultado);
		//resultado = resultado + 1;
		//resultado += 1;
		
		
		System.out.println(++resultado); // primeiro add o valor e dps faz o output dela
		//mesma coisa que
		//resultado += 1;
		//System.out.println(resultado);
	
		resultado --;
		System.out.println(resultado);
		System.out.println(resultado--);
		System.out.println(--resultado);
	}

}
