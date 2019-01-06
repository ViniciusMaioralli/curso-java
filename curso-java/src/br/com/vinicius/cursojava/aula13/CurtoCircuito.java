package br.com.vinicius.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		
		boolean falso = false;
		
		boolean resultado1 = falso & 
				verdadeiro;
		
		boolean resultado2 = falso && 
				verdadeiro; // mais utlizado pois verifica só o primeiro, se o primeiro for falso o segundo tbm sera
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		
		System.out.println(resultado);
	
	
		// OBS: O '&&' é o curto circuito abordado nessa aula
	
	}

}
