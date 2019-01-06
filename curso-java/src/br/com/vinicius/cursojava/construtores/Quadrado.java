package br.com.vinicius.cursojava.construtores;

public class Quadrado {
	
	private double lado;
	
	// exemplo
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado() {
		
	}
}


// Se voce nao gerar nenhum construtor o JAVA gera o que chamamos de construtor padrao
// isso e gerado no momento que o bytecode e gerado
// a partir do momento que vc gera um construtor o java nao gera um automático
