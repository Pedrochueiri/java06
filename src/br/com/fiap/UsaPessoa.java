package br.com.fiap;

public class UsaPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("Lucao do vrau",2004);
		
		p1.setNome("Lucao do vrau");
		p1.setAnoNascimento(2000);
		
		System.out.println("Nome: "+ p1.getNome() + "\nIdade :" + p1.calculaIdade(2022));
		System.out.println("Nome: "+ p2.getNome() + "\nIdade :" + p2.calculaIdade(2022));
	}
}
