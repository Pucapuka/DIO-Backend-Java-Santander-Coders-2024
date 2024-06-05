package com.bancoDigital.src;
import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Bem vindo ao banco Santander! Selecione uma opção:");
			System.out.println("1. Abrir conta\n"
							  +"2. Acessar conta\n"
							  +"0. Sair");
			
			int opcao = scan.nextInt();
			if(opcao == 0) {
				System.exit(0);
			}else if(opcao == 1){
				System.out.println("Escolha qual tipo de conta você quer abrir:");
				System.out.println("1. Poupanca\n"
								+ "2. Corrente\n"
								+ "0. Voltar");
				int escolha = scan.nextInt();
				if(escolha == 0) {
					return;
				}else if(escolha == 1) {
					System.out.println("Preencha o formulário abaixo:");
					System.out.print("Nome: ");
					String nome = scan.next();
					Cliente cliente = new Cliente();
					cliente.setNome(nome);
					ContaBancaria poupanca = new ContaPoupanca(cliente);
					return;
				}else if (escolha == 2) {
					System.out.println("Preencha o formulário abaixo:");
					System.out.print("Nome: ");
					String nome = scan.next();
					Cliente cliente = new Cliente();
					cliente.setNome(nome);
					ContaBancaria corrente = new ContaCorrente(cliente);
					return;
				}
			}else if(opcao==2) {
				System.out.println("Escolha qual serviço você quer realizar:");
				System.out.println("1. Depositar\n"
								+ "2. Sacar\n"
								+ "3. Transferir\n"
								+ "0. Voltar");
				int escolha = scan.nextInt();
				if(escolha == 0) {
					return;
				}else if(escolha == 1) {
					System.out.println("Digite qual valor você quer depositar:");
					System.out.print("Valor: ");
					Double valor = scan.nextDouble();

					return;
				}else if (escolha == 2) {
					System.out.println("Preencha o formulário abaixo:");
					System.out.print("Nome: ");
					String nome = scan.next();
					Cliente cliente = new Cliente();
					cliente.setNome(nome);
					ContaBancaria corrente = new ContaCorrente(cliente);
					return;
				}
			}
		}
		
//		
//		corrente.depositar(250.00);
//		corrente.transferir(100, poupanca);
//		
//		corrente.imprimirExtrato();
//		System.out.println();
//		poupanca.imprimirExtrato();
		
	}
	
}