package com.bancoDigital.src;

public interface IConta {
	
	void sacar(double valor);
	void depositar (double valor);
	void transferir (double valor, IConta contaDestino);
	void imprimirExtrato();
	int getAgencia();
	int getNumero();
	double getSaldo();
	
}
