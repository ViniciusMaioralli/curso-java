package br.com.vinicius.cursojava.heranca;

public class Carro02 extends Veiculo02 {
	
	//public Carro02(String marca) {
		// Esse super invoca o construtor da classe de cima
		//super(marca);
	//}
	
	// se eu nao quiser passar a marca como parametro:
	public Carro02() {
		super ("Y");
	}
	
}
// no caso de "carro02 extends veiculo02" nao compila porque nao consegue gerar o construtor default.
// deve definir um construtor para classe carro e passar a marca como parâmetro
// o super SEMPRE deve ser a primeira linha do seu codigo se não ele nao vai compilar.
// quando vc omite o super da primeira linha ele omite o parametro.
// esse parametro "Y" tem de ser passado em algum lugar nesse caso passando em super é uma marca fixa.