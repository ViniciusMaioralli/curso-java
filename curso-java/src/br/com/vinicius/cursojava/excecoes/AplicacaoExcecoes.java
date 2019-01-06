package br.com.vinicius.cursojava.excecoes;

import java.io.IOException;

public class AplicacaoExcecoes {

	public static void main(String[] args) {
		
		//boolean retorno = 
		
		//int retorno = m1();
		
		//if(retorno == 100) {
			// sucesso
		//}else if(retorno == 101) {
			// erro de validação
		
		//try {
			
		// }catch(IOException e) {
			// System.out.println("I/O Exception no main");
		try {
			m1();
		}catch(AppException e) {
			System.out.println(e.getCode());
		}
		
		
		//if(retorno) {
			// funcionou
		//}else {
			// falhou
		//}

	}
	
	static void m1() throws AppException{ //throws IOException{ // desse modo a exception e "jogada" para fora
		
	
		// trata o erro
		try {
			
			m2();
		}catch (IOException e) { // transforma em uma nova exception:
			
			throw new AppException(100);
			
			// System.out.println("AppException: " + e.getCode());
			
		//}catch(Exception e) {
		// NAO PRECISA MAIS POIS FOI LANCADA EM CIMA DO METODO }catch(IOException e) {
			//System.out.println("Erro: " + e.getMessage()); // retorna a string que foi passada no construtor, no caso a msg "erro de pro.."
		}
	}	
		
		
		
		
		// nao é necessario lancar excecao pois m2 ja lancou (coloquei isso quando lancei 3 exceptions nos 3 métodos)
		
	
	
	// declara exception junto ao metodo
	static void m2() throws /*AppException,*/ IOException { // lanca mais de uma exception
		
			//throws Exception{
		// processando...
		
		// throw new Exception("erro de processamento"); 
		
		//throw new AppException(100);
		
		throw new IOException("Erro de I/O");
	}
}
// tratando excecoes como demais linguagens que nao possuem excecoes fazem atraves do boolean
// nao e necessario tratar os retorno em java
// uma excecao e uma classe que herda de exception ou ela mesma
// throw lança excecoes
// toda vez que o Java encontra um throw o codigo para de ser executado
// throws na asssinatura do metodo diz que ele PODE lançar uma excecao, throw e throws são diferentes
// após colocar uma excecao no método main, quem trata é a jvm, dessa forma ela encerra a aplicação
// apenas 1 bloco catch é executado por vez nunca mais do que 1
// a ordem dos blocos catch podem influenciar no seu tratamento