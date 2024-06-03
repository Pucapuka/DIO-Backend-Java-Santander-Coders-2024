package com.bancoDigital.src;

public class ContaPoupanca extends ContaBancaria{
	
	public ContaPoupanca (Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("-----EXTRATO DE CONTA POUPANÇA------");
		super.imprimirInformacoes();
		System.out.println("------------------------------------");
	}
	
}