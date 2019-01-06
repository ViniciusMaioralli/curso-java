package br.com.vinicius.cursojava.classesAbstratas;

public abstract class Item {
	
	protected int posx;
	
	protected int posy;
	
	public abstract void pegar(); 
		
	
}

// definida como abstract, assim não pode ter instancia de objetos da classe.
// método definido como abstract, nao serpa implementado e só podem existir em classes abstratas.
// obrigo as classes que herdam de item implementar os métodos.