package com.bancoDigital.src;

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		System.out.println("Bem vindo ao banco Santander!");
		while(true) {
			String nome;
			Cliente cliente;
			
			Scanner scan = new Scanner(System.in);
				System.out.println("Selecione uma opção:");
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
					switch(escolha) {
						
						case 0:
							break;
						
						case 1:
							System.out.println("Preencha o formulário abaixo:");
							System.out.print("Nome: ");
							nome = scan.next();
							cliente = new Cliente();
							cliente.setNome(nome);
							ContaBancaria poupanca = new ContaPoupanca(cliente);
							System.out.println("Conta Poupança aberta com sucesso em nome de "+ nome+"!\n\n");
							break;
							
						case 2:
							System.out.println("Preencha o formulário abaixo:");
							System.out.print("Nome: ");
							nome = scan.next();
							cliente = new Cliente();
							cliente.setNome(nome);
							ContaBancaria corrente = new ContaCorrente(cliente);
							System.out.println("Conta Corrente aberta com sucesso em nome de "+ nome+"!\n\n");
							break;
							
						default:
							System.out.println("Escolha uma opção válida");
						
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
						System.out.println("voltando...");
						break;
					}else if(escolha == 1) {
						System.out.println("Digite qual valor você quer depositar:");
						System.out.print("Valor: ");
						Double valor = scan.nextDouble();
						break;
					}else if (escolha == 2) {
						System.out.println("Preencha o formulário abaixo:");
						System.out.print("Nome: ");
						nome = scan.next();
						cliente = new Cliente();
						cliente.setNome(nome);
						ContaBancaria corrente = new ContaCorrente(cliente);
						break;
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