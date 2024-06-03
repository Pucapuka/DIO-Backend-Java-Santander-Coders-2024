package com.bancoDigital.src;

public class Main{
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		
		
		ContaBancaria corrente = new ContaCorrente(paulo);
		ContaBancaria poupanca = new ContaPoupanca(paulo);
		
		corrente.depositar(250.00);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		System.out.println();
		poupanca.imprimirExtrato();
		
	}
	
}