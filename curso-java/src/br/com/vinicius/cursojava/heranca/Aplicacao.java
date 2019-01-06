package br.com.vinicius.cursojava.heranca;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Carro c = new Carro();
		//System.out.println("Carro");
		//c.imprimirDados();
		//System.out.println();
		
		//	Motocicleta m = new Motocicleta();
		//	System.out.println("Motocicleta");
		//	m.imprimirDados();
		//	System.out.println();
		
		//	Caminhao cam = new Caminhao();
		//	System.out.println("Caminhão");
		//	cam.imprimirDados();
		//	System.out.println();
		
		Veiculo v = new Veiculo();
		System.out.println(v); // exibira o endereco de memoria do objeto no heap.
		
		// TODAS AS CLASSES TEM ESSSE METODO TOSTRING
		v.toString();
	}

}
