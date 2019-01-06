package br.com.vinicius.cursojava.modificadores;

public class ContaCorrente {

	private int numConta;
	
	private int cpf;
	
	private boolean ativa;
	
	private double saldo;
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	//getters and setters
	
	public int getNumConta() {
		return numConta;
	}

	public int getCpf() {
		return cpf;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
