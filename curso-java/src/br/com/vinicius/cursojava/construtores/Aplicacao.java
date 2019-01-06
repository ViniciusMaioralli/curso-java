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

// ao passar um parametro no construtor deve se passar na criação do objeto
// so deixa sem passar parametro quando vc declara o construtor padrao sem parametros





// Anotações

// passar os valores referentes aos parametros que estão presentes no construtor.
// construtor é bastante utilizado para inicializar valores.
// Se não passar nenhum parametro o que sera utilizado sao os valores setados no construtor.
// nao podem ter as mesmas assinaturas