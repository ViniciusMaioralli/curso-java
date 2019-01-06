package br.com.vinicius.cursojava.elementosEstaticos;

public class Aplicacao {

	public static void main(String[] args) {
		
		 //Matematica mat = new Matematica();
		
		//double resultado = Matematica.subtrair(100, 20); // metodo estatico vc usa a classe para chama-lo.
		
		//System.out.println(resultado);
		
		Gerenciador g1 = new Gerenciador();
		
		Gerenciador g2 = new Gerenciador();
		
		Gerenciador g3 = new Gerenciador();
		
		// outra forma de fazer
		//int c = Gerenciador.getContador();
		// ja que agora o atributo e estatico posso chamar diretamente da classe
		//System.out.println(c);
		
		
		//System.out.println(g1.contador);	
		//System.out.println(g2.contador);
		//System.out.println(g3.contador);
		// as instancias enxergam a alteração do atributo para o static
		
		int versao = Constantes.VERSAO_PROGRAMA;
		
	}

}
// cria objeto do tipo matematica para chamar o metodo
// sendo os metodos estaticos nao preciso mais instanciar o objeto