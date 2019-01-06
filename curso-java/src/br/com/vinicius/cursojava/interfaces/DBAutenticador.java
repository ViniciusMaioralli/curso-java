package br.com.vinicius.cursojava.interfaces;

public class DBAutenticador implements Autenticador {
	
	public boolean autenticar (String usuario, String senha) {
		
		// checa se o usuário é valido 
		return true;
	}

}
// a relação entre classes e interfaces se dão por uma espécie de contrato.
// voce pode fazer parte do que eu sou mas terá que implementar meus métodos.