package br.com.vinicius.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double vlHora;
		
		double horasMes;
		
		double salarioBruto;
		
		double iR;
		
		double sindicato;
		
		double salarioLiquido;
		
		double inss;
		
		System.out.println("Quanto vc ganha por hora ?");
		
		vlHora = scan.nextDouble();
		
		System.out.println("Quantas horas vc trabalhou no mês");
		
		horasMes = scan.nextDouble();
		
		salarioBruto = vlHora * horasMes;
		
		// 
		//System.out.println("Salário Bruto: " +salarioBruto + "R$");
		
		iR = salarioBruto * 0.11;
		// A
		//System.out.println("IR: "+ iR +"R$");
		
		sindicato = salarioBruto * 0.05;
		// B
		
		inss = salarioBruto * 0.08;
		
		//System.out.println("INSS: " +inss + "R$");
		
		//System.out.println("Sindicato: " +sindicato + "R$");
		
		salarioLiquido = salarioBruto - iR - sindicato - inss;
		//C
		//System.out.println("Salário Líquido: " +salarioLiquido + "R$");
		
		System.out.println("Salário Bruto: " +salarioBruto + "R$" + "\n" + "IR(11%): "+ iR +"R$" + "\n" +"INSS(8%): " +inss + "R$" 
					+	"\n" +"Sindicato(5%): " +sindicato + "R$" + "\n" +"Salário Líquido: " +salarioLiquido + "R$");
		
		
		

	}

}
