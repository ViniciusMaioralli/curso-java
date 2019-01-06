package br.com.vinicius.cursojava.heranca;

public class Veiculo {
	
	protected int cor;
	
	protected String marca;
	
	protected String modelo;
	
	public void buzinar() {
		System.out.println("bi bi");
	}
	
	public void imprimirDados() {
		System.out.println("Cor = " +cor);
		System.out.println("Marca =" +marca);
		System.out.println("Modelo =" +modelo);
	}
	
	// mudando comportamento do metodo toString da classe Object	
	public String toString() {
		return "Cor =" +cor + " ; Marca =" +marca + " ; Modelo =" +modelo;
	}
	

}

// nesse momento veiculo é uma superclasse.
// subclasses nao acessam atributos declarados como private
// protected libera o acesso as subclasses.
// sempre que voce nao herda de nenhuma classe automaticamente o Java faz ela herdar da classe Object.
// TODAS AS CLASSES herdam diretamente ou indiretamente de Object.