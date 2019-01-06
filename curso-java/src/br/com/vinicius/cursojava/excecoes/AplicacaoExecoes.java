package br.com.vinicius.cursojava.excecoes;

public class AplicacaoExecoes {

	public static void main(String[] args) {
		
		//boolean retorno = 
		
		int retorno = m1();
		
		if(retorno == 100) {
			// sucesso
		}else if(retorno == 101) {
			// erro de validação
		}
		
		m1();
		
		//if(retorno) {
			// funcionou
		//}else {
			// falhou
		//}

	}
	
	static int m1() {
		// algum codigo
		
		return 100;
	}
}

// tratando excecoes como demais linguagens que nao possuem excecoes fazem atraves do boolean
// nao e necessario tratar os retorno em java
// 