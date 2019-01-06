package br.com.vinicius.cursojava.classesAbstratas;

public abstract class Item {
	
	protected int posx;
	
	protected int posy;
	
	public abstract void pegar(); 
		
	
}

// definida como abstract, assim n�o pode ter instancia de objetos da classe.
// m�todo definido como abstract, nao serpa implementado e s� podem existir em classes abstratas.
// obrigo as classes que herdam de item implementar os m�todos.