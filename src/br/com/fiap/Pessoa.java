package br.com.fiap;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private int anoNascimento;

	public Pessoa() {

	}

	public Pessoa(String nome, int anoNascimento) {
		this.nome = nome;
		setAnoNascimento(anoNascimento);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		LocalDate anoAtual = LocalDate.now();
		try {
			if (anoNascimento >= 1900 && anoNascimento <= anoAtual.getYear()) {
				this.anoNascimento = anoNascimento;
			} else {
				throw new Exception("Valor inválido! (1900 - ano atual)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int calculaIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;
	}
}
