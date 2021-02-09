package prjatm.infnet;

import java.util.Scanner;

public class Atm {
    
    public static void main(String[] args) {
        System.out.println("Bem vindo!");
        System.out.println("Digite o número da sua conta: ");
        Scanner scan = new Scanner(System.in);
        int numeroConta = scan.nextInt();

        System.out.println("Digite a sua senha: " + scan.nextLine());    
        int senha = scan.nextInt();

        if(numeroConta != 1212 || senha != 123) {
            System.out.println("Conta ou senha inválida");
            scan.close();
            return;
        }

        System.out.println("Logado com sucesso!");

        System.out.println( " Menu ");
        System.out.println( " 1 - Ver saldo ");
        System.out.println( " 2 - Saque ");
        System.out.println( " 3 - Deposito ");
        System.out.println( " 4 - Sair ");
        System.out.println( " Entre com a opção: ");
        int opcao = scan.nextInt();

        int saldo = 15;
    
        while(opcao <= 3) {
            System.out.println("\n");
            switch(opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                break;
                case 2:
                    System.out.println("Saldo atual: R$ " + saldo);
                    System.out.println("Digite o valor que deseja sacar:");
                    int saque = scan.nextInt();
    
                    if (saque > saldo) {
                        System.out.println("Valor inválido, tente novamente!");
                    }
    
                    saldo -= saque;
                break;
                case 3:
                    System.out.println("Digite o valor para depositar:");
                    saldo += scan.nextInt();
                break;
                case 4:
                    System.out.println("Desconectado com sucesso!");
                break;
                default:
                break;
            }

            System.out.println( "\n");
            System.out.println( " Menu ");
            System.out.println( " 1 - Ver saldo ");
            System.out.println( " 2 - Saque ");
            System.out.println( " 3 - Deposito ");
            System.out.println( " 4 - Sair ");
            System.out.println( " Entre com a opção: ");
            opcao = scan.nextInt();
        }

        scan.close();
    }
}
