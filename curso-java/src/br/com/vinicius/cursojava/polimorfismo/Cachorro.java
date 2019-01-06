package br.com.vinicius.cursojava.polimorfismo;

public class Cachorro extends Animal {
	
	public void falar() {
		System.out.println("AU AU");
	}
	
	public void morder() { // especifico de cachorro
		System.out.println("NHAC");
	}

}
