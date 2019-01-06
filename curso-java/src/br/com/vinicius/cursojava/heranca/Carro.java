package br.com.vinicius.cursojava.heranca;

public class Carro extends Veiculo{
	
	private boolean quatroPortas;
	
	public void imprimirDados() {
		// chama o metodo da classe de cima, no caso é o Veiculo aproveitando o metodo e nao o descartando como a sobrescrita de
		// metodos
		super.imprimirDados();
		System.out.println("Quatro Portas =" +quatroPortas);
	}
	
	

}

// Anotações
// um carro é um veículo, portanto ele herda tudo o que um veículo tem 
// declarando o extends nao preciso mais dos atributos declarados e dos métodos (cor, marca e modelo), pois estão presentes em veículo
// uma classe não herda mais de uma classe (herança simples), NÃO herda de duas ou mais classes.
// carro tem acesso a cor pois o atributo esta declarado como protected