package dougbank;

import java.util.Scanner;

public class DougBank {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ContaBancaria conta = null;

	        System.out.println("Digite seu nome:");
	        String nome = scanner.nextLine();

	        System.out.println("Digite o número da conta:");
	        int numeroConta = scanner.nextInt();

	        System.out.println("Escolha o tipo de conta:");
	        System.out.println("1 - Corrente");
	        System.out.println("2 - Poupança");
	        System.out.println("3 - Salário");
	        System.out.println("4 - Pessoa Jurídica");
	        int tipo = scanner.nextInt();

	        switch (tipo) {
	            case 1:
	                conta = new ContaCorrente(nome, numeroConta, 0.00);
	                break;
	            case 2:
	                conta = new ContaPoupanca(nome, numeroConta, 0.00);
	                break;
	            case 3:
	                conta = new ContaSalario(nome, numeroConta, 0.00);
	                break;
	            case 4:
	                conta = new ContaPessoaJuridica(nome, numeroConta, 0.00);
	                break;
	            default:
	                System.out.println("Tipo inválido.");
	                System.exit(0);
	        }

	        int opcao;
	        do {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1 - Ver saldo");
	            System.out.println("2 - Depositar");
	            System.out.println("3 - Sacar");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    conta.verSaldo();
	                    break;
	                case 2:
	                    System.out.print("Digite o valor para depositar: ");
	                    double deposito = scanner.nextDouble();
	                    conta.depositar(deposito);
	                    break;
	                case 3:
	                    System.out.print("Digite o valor para sacar: ");
	                    double saque = scanner.nextDouble();
	                    conta.sacar(saque);
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa.");
	                    break;
	                default:
	                    System.out.println("Opção inválida.");
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }
	}