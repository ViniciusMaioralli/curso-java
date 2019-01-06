package br.com.vinicius.cursojava.classesAbstratas;

public class AplicacaoAbstrata {
	
	public static void main(String [] args) {
	
	//Moeda m = new Moeda();
	
	//m.pegar();
		
		
	Item i1 = new Moeda(); 
	i1.pegar(); // executar� m�todo definido na classe Moeda.
	
	Item i2 = new Diamante();
	i2.pegar(); // executar� o m�todo definido na classe Diamante.
	
	//Item i3 = new Item(); // n�o instancia pq � do tipo abstrato
	//i3.pegar();
	
	Item i3 = new Cogumelo();
	i3.pegar();
	
	}
}


// Moeda m = new Moeda();
// pega implementa��o da classe moeda e n�o da classe item.
// new Moeda -> objeto pego na mem�ria (heap).
// apesar de eu nao poder ter objetos de item na mem�ria, pode ter refer�ncias a classe Item.