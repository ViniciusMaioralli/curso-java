package br.com.vinicius.cursojava.interfaces;

public class DBAutenticador implements Autenticador {
	
	public boolean autenticar (String usuario, String senha) {
		
		// checa se o usu�rio � valido 
		return true;
	}

}
// a rela��o entre classes e interfaces se d�o por uma esp�cie de contrato.
// voce pode fazer parte do que eu sou mas ter� que implementar meus m�todos.