package br.com.vinicius.cursojava.classesAbstratas;

public class AplicacaoAbstrata {
	
	public static void main(String [] args) {
	
	//Moeda m = new Moeda();
	
	//m.pegar();
		
		
	Item i1 = new Moeda(); 
	i1.pegar(); // executará método definido na classe Moeda.
	
	Item i2 = new Diamante();
	i2.pegar(); // executará o método definido na classe Diamante.
	
	//Item i3 = new Item(); // não instancia pq é do tipo abstrato
	//i3.pegar();
	
	Item i3 = new Cogumelo();
	i3.pegar();
	
	}
}


// Moeda m = new Moeda();
// pega implementação da classe moeda e não da classe item.
// new Moeda -> objeto pego na memória (heap).
// apesar de eu nao poder ter objetos de item na memória, pode ter referências a classe Item.