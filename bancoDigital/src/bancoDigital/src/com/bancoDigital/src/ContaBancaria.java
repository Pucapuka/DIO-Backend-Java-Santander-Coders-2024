package com.bancoDigital.src;

public abstract class ContaBancaria implements IConta{

	public static final int AGENCIA_PADRAO = 1;
	public static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public ContaBancaria(Cliente cliente) {
		this.agencia = ContaBancaria.AGENCIA_PADRAO;
		this.numero = ContaBancaria.SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public void transferir(double valor, IConta contaDestino){
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public int getAgencia() {
		return agencia;
	}
	
	@Override
	public int getNumero() {
		return numero;
	}
	
	@Override
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInformacoes() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
}