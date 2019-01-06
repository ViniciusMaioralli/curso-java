package br.com.vinicius.cursojava.excecoes;

public class AppException extends Exception {
	
	private int code;
	
	public AppException (int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
}

// criando minha exception