package br.com.unipe.cc.modelo;

import br.com.unipe.cc.controle.AtualizarConta;

public class Conta implements AtualizarConta{
  private String nome;
  private String numero;
  private double saldo;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}


public double getSaldo() {
	return saldo;
}

public double setSaldo(double saldo) {
	return this.saldo = saldo;
}
@Override
public double saca(double valor) {
	return this.saldo -=valor;
	
}

@Override
public double deposita(double valor) {
	return this.saldo += valor;
	
}

}

