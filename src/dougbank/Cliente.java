package dougbank;

public class Cliente {
	private String nome;
	private int conta;
	private double saldo;

	public Cliente(String nome, int conta, double saldo) {
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
