package br.com.vinicius.cursojava.construtores;

public class Aplicacao {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo(2, 4);
		
		double area = r1.calcularArea();
		
		System.out.println(area);
		
		Retangulo r2 = new Retangulo();
		
		 area = r2.calcularArea();
		 
		 System.out.println(area);
		 
		 Quadrado q = new Quadrado();
		 
		 
	}

}

// ao passar um parametro no construtor deve se passar na cria��o do objeto
// so deixa sem passar parametro quando vc declara o construtor padrao sem parametros





// Anota��es

// passar os valores referentes aos parametros que est�o presentes no construtor.
// construtor � bastante utilizado para inicializar valores.
// Se n�o passar nenhum parametro o que sera utilizado sao os valores setados no construtor.
// nao podem ter as mesmas assinaturas