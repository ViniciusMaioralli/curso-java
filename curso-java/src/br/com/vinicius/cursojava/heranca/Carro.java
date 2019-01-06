package br.com.vinicius.cursojava.heranca;

public class Carro extends Veiculo{
	
	private boolean quatroPortas;
	
	public void imprimirDados() {
		// chama o metodo da classe de cima, no caso � o Veiculo aproveitando o metodo e nao o descartando como a sobrescrita de
		// metodos
		super.imprimirDados();
		System.out.println("Quatro Portas =" +quatroPortas);
	}
	
	

}

// Anota��es
// um carro � um ve�culo, portanto ele herda tudo o que um ve�culo tem 
// declarando o extends nao preciso mais dos atributos declarados e dos m�todos (cor, marca e modelo), pois est�o presentes em ve�culo
// uma classe n�o herda mais de uma classe (heran�a simples), N�O herda de duas ou mais classes.
// carro tem acesso a cor pois o atributo esta declarado como protected