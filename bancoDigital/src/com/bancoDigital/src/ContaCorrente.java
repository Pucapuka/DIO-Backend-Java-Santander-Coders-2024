package com.bancoDigital.src;

public class ContaCorrente extends ContaBancaria{
	
	public ContaCorrente (Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("-----EXTRATO DE CONTA CORRENTE------");
		super.imprimirInformacoes();
		System.out.println("------------------------------------");
	}
	
}