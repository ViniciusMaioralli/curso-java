package br.com.vinicius.cursojava.modificadores;

public class Aplicacao {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		/*
		c1.numConta = 123;
		c1.cpf = 1245432;
		c1.ativa = true; 
		*/
		
		
		c1.depositar(100);
		c1.sacar(20);
		
		double saldo = c1.getSaldo();
		
		System.out.println(saldo);
		
		
		
	}

}
