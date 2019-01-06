package br.com.vinicius.cursojava.polimorfismo;

public class AplicacaoPolimorfismo {

	public static void main(String[] args) {
		
		// se cachorro estende animal eu posso dizer que cachorro e um animal, entao eu posso ter um objeto atribuido a um tipo animal
		// o tipo especifico é do tipo generico
		Animal c = new Cachorro(); // Java pega pelo objeto referenciado, mas nao importa como ele é referenciado, quem decide é o 
		// objeto que esta na memoria e nao a referencia.
		c.falar(); // falar do  cachorro, não do animal
		//c.morder(); // nao posso chamar a referencia a esse objeto nao e do tipo cachorro é do tipo animal
		
		// 2 opções
		// 1º 
		//Cachorro ca = new Cachorro();
		//ca.morder();
		
		//InstanceOf
		if(c instanceof Cachorro) { // verifica se na memoria aquela referencia apontado por c é um cachorro.
			Cachorro ca = (Cachorro) c;  
		}
		
		// 2º 
		Cachorro cac = (Cachorro) c; // fazendo casting para o tipo especifico, transformando SEMPRE A REFERENCIA (CACHORRO) E NAO O OBJETO
		cac.morder();
		//Gato g = new Gato();
		//g.falar();

	}

}

