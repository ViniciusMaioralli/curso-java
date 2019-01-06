package br.com.vinicius.cursojava.elementosEstaticos;

public class Gerenciador {
	
	private static int contador = 0;
	
	// aqui eu faço 6 item
	public Gerenciador() {
		contador++;
	}
	
	public static int getContador(){
		return contador;
	}
}

// 1 - contar quantas vezes eu instanciei o objeto
// 2 -nao importa quantos objetos eu criar, um contador sempre vai ser de um objeto especifico
// 3 - declarar um atributo como static referencia um atributo a classe nao ao objeto
// 4 - por boa pratica os atributos SEMPRE SAO PRIVADOS PELA CLASSE DELES
// 5 - assim fazemos os encapsulamentos para acessa-los usando getters e setters
// 6 -nao posso chamar um elenento nao estatico dentro de um metodo estatico o contrário eu posso fazer