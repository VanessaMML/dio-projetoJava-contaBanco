package br.com.dio.projeto;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Por favor, digite o n�mero da ag�ncia: ");
		agencia = leitor.nextLine();
		System.out.println("Agora digite seu nome: ");
		nomeCliente = leitor.nextLine();
		System.out.println("Qual o n�mero da conta? ");
		numeroConta = leitor.nextInt();
		System.out.println("Digite o valor que gostaria de sacar: ");
		saldo = leitor.nextDouble();
		
		System.out.println("Ol� " + nomeCliente + ", obrigada por criar uma conta em nosso banco, "
				+ "sua ag�ncia � " + agencia + ", conta " + numeroConta + " e seu saldo " 
				+ saldo + " j� est� dispon�vel pra saque!");
		
		
		leitor.close();
	}

}
