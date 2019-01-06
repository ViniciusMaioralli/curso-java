package br.com.vinicius.cursojava.construtores;

public class Retangulo {
	
	private double altura;
	
	private double largura;
	
	// declarando um construtor:
	public Retangulo (double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	// Sobrecarga de Construtores
	public Retangulo () {
		// invocando da propria classe
		
		this(5, 5);
		
		//this.altura = 5;
		//this.largura = 5;
	}
	
		
	
	public double calcularArea() {
		return altura * largura;
	}
}
 // atributos do tipo double o Java inicializa como 0
 // O construtor sempre deve ter o mesmo nome da classe





