package br.com.vinicius.cursojava.interfaces;

public class AplicacaoInterfaces {

	public static void main(String[] args) {
		
		//Autenticador a = new DBAutenticador();
		
		Autenticador a = obterAutenticador();
		
		boolean sucesso = a.autenticar("u", "s");
		 
		 if(sucesso ) {
			 System.out.println("Autenticou !");
		 }else {
			 System.out.println("Não Autenticou !");
		 }

	}
	
	private static Autenticador obterAutenticador() {
		
		//return new DBAutenticador();
		
		return new FileAutenticador();
	}
}
// aplico polimorfismo devido a referencia a interface e nao a classe.
// retiro o return new DBAutenticador se em hipotese quisesse validar de arquivos ao invés do banco de dados.
// SEMPRE ENCAPSULAR as coisas