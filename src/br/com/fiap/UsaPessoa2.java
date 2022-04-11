package br.com.fiap;

import java.util.Scanner;

public class UsaPessoa2 {
	public static void main(String[] args) {
		Pessoa p1;
		Scanner scan;
		/*
		 * String nome = ""; int ano = 0;
		 */

		try {
			scan = new Scanner(System.in);
			System.out.println("Digite seu nome:");
			/* nome = scan.nextLine(); */
			System.out.println("Digite o ano de Nascimento:");
			/* ano = scan.nextInt(); */

			p1 = new Pessoa(scan.nextLine(), scan.nextInt());

			System.out.println("Nome: " + p1.getNome() + "\nIdade :" + p1.calculaIdade(2022));

		} catch (Exception e) {
			System.out.println("Algo esta errado!!");
		}
	}
}
