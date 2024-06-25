package com.bancoDigital.src;

import java.util.Scanner;

public class Main {

    private static ContaBancaria corrente;
    private static ContaBancaria poupanca;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao banco Santander!");

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Abrir conta\n"
                             + "2. Acessar conta\n"
                             + "0. Sair");

            int opcao = scan.nextInt();

            switch(opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    abrirConta(scan);
                    break;
                case 2:
                    acessarConta(scan);
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
        }
    }

    private static void abrirConta(Scanner scan) {
        System.out.println("Escolha qual tipo de conta você quer abrir:");
        System.out.println("1. Poupanca\n"
                         + "2. Corrente\n"
                         + "0. Voltar");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 0:
                break;
            case 1:
                System.out.println("Preencha o formulário abaixo:");
                System.out.print("Nome: ");
                String nomePoupanca = scan.next();
                Cliente clientePoupanca = new Cliente();
                clientePoupanca.setNome(nomePoupanca);
                poupanca = new ContaPoupanca(clientePoupanca);
                System.out.println("Conta Poupança aberta com sucesso em nome de " + nomePoupanca + "!\n\n");
                break;
            case 2:
                System.out.println("Preencha o formulário abaixo:");
                System.out.print("Nome: ");
                String nomeCorrente = scan.next();
                Cliente clienteCorrente = new Cliente();
                clienteCorrente.setNome(nomeCorrente);
                corrente = new ContaCorrente(clienteCorrente);
                System.out.println("Conta Corrente aberta com sucesso em nome de " + nomeCorrente + "!\n\n");
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }
    }

    private static void acessarConta(Scanner scan) {
        System.out.println("Escolha qual tipo de conta você quer acessar:");
        System.out.println("1. Poupanca\n"
                         + "2. Corrente\n"
                         + "0. Voltar");
        int tipoConta = scan.nextInt();

        switch (tipoConta) {
            case 0:
                return;
            case 1:
                if (poupanca == null) {
                    System.out.println("Nenhuma conta poupança encontrada. Por favor, abra uma conta primeiro.");
                } else {
                    acessarContaEspecifica(scan, poupanca);
                }
                break;
            case 2:
                if (corrente == null) {
                    System.out.println("Nenhuma conta corrente encontrada. Por favor, abra uma conta primeiro.");
                } else {
                    acessarContaEspecifica(scan, corrente);
                }
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }
    }

    private static void acessarContaEspecifica(Scanner scan, ContaBancaria conta) {
        while (true) {
            System.out.println("Escolha qual serviço você quer realizar:");
            System.out.println("1. Depositar\n"
                             + "2. Sacar\n"
                             + "3. Transferir\n"
                             + "0. Voltar");
            int escolha = scan.nextInt();

            switch (escolha) {
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    return;
                case 1:
                    System.out.println("Digite qual valor você quer depositar:");
                    System.out.print("Valor: ");
                    double valorDeposito = scan.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite qual valor você quer sacar:");
                    System.out.print("Valor: ");
                    double valorSaque = scan.nextDouble();
                    conta.sacar(valorSaque);
                    System.out.println("Saque realizado com sucesso.");
                    break;
                case 3:
                    System.out.println("Digite qual valor você quer transferir:");
                    System.out.print("Valor: ");
                    double valorTransferencia = scan.nextDouble();
                    System.out.println("Digite o tipo de conta de destino:");
                    System.out.println("1. Poupança\n"
                                     + "2. Corrente");
                    int tipoDestino = scan.nextInt();
                    ContaBancaria contaDestino = null;
                    if (tipoDestino == 1) {
                        contaDestino = poupanca;
                    } else if (tipoDestino == 2) {
                        contaDestino = corrente;
                    }
                    if (contaDestino != null) {
                        conta.transferir(valorTransferencia, contaDestino);
                        System.out.println("Transferência realizada com sucesso.");
                    } else {
                        System.out.println("Conta de destino inválida.");
                    }
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
        }
    }
}
