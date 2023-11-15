package challenge;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Miguel Schrempp";
        String accountType = "Corrente";
        double balance = 0.0;
        int option = 0;

        while (option != 4) {
            System.out.println("\n Operações");

            System.out.println("""
                    1 - Consulta de saldo
                    2 - Depósito de valor
                    3 - Tranferência de valor
                    4 - Sair
                    """);

            System.out.println("Digite a opção desejada:");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("*".repeat(75));
                    System.out.println("Extrato da conta:");

                    System.out.printf("""
                            Nome: %s,
                            Tipo da conta: %s,
                            Saldo: %.2f
                            """, name, accountType, balance);

                    System.out.println("*".repeat(75));
                    break;
                case 2:
                    System.out.println("Informe o valor a ser depositado:");
                    double deposit = sc.nextDouble();
                    if (deposit <= 0) {
                        System.out.println("Valor não pode ser negativo.");
                        break;
                    } else {
                        balance += deposit;
                    }

                    System.out.printf("Saldo atualizado: %.2f", balance);
                    break;
                case 3:
                    System.out.println("Informe o valor da transferência:");
                    double transfer = sc.nextDouble();

                    if (transfer > balance) {
                        System.out.println("Operação inválida devido ao valor do depósito ser maior que o valor em conta");
                    } else if (transfer <= 0) {
                        System.out.println("Valor não pode ser negativo.");
                        break;
                    } else {
                        balance -= transfer;
                        System.out.printf("Saldo atualizado: %.2f", balance);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        }
    }
}
