package br.com.vinicius.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		// Convenção Java
		int idade = 19;
		String nome = "Vinicius";
		String nomeDoMeuCachorro = "Perola";
		String ano2014 = "2014";
		
		// Aceito mas não utilizadas
		int _idade;
		int $idade;
		
		
		// Não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		
		idade = 25;
		
		System.out.println("Idade = "+ idade);
		System.out.println("Nome = "+ nome);
		
		// má prática 
		int a = 10;
		String b = "Vinicius";
		

	}

}
