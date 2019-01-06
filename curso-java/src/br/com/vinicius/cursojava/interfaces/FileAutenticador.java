package br.com.vinicius.cursojava.interfaces;

public class FileAutenticador implements Autenticador {

	public boolean autenticar(String usuario, String senha) {
		// autentica baseado em arquivo
		return true;
	}

}
