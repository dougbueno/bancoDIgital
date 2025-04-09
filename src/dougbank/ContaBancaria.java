package dougbank;

public abstract class ContaBancaria implements OperacoesBancarias {
    protected String nome;
    protected int numeroConta;
    protected double saldo;

    public ContaBancaria(String nome, int numeroConta, double saldoInicial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    @Override
    public void verSaldo() {
        System.out.printf("Saldo atual de %s (Conta %d): R$ %.2f%n", nome, numeroConta, saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}