package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void exibeFatura(List<Compra> lista) {
        System.out.println("*".repeat(75));
        System.out.println("FATURA DO CARTÃO");
        if (lista.isEmpty()) {
            System.out.println("Sem compras registradas!");
        } else {
            lista.sort(Comparator.comparing(Compra::getValorDaCompra));
            for (Compra c : lista) {
                System.out.println(c);
            }
        }
        System.out.println("*".repeat(75));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        List<Compra> listaDeCompra = new ArrayList<>();
        int valor = 2;
        Double limiteCartao = null;

        while (valor != 0) {
            Compra compra = new Compra();

            if (valor == 2) {
                System.out.println("Digite o limite do cartão:");
                limiteCartao = sc2.nextDouble();
            }

            System.out.println("Digite a descrição da compra:");
            compra.setNomeDaCompra(sc.nextLine());

            System.out.println("Digite o valor da compra: ");
            compra.setValorDaCompra(sc2.nextDouble());

            if (compra.getValorDaCompra() > limiteCartao) {
                System.out.println("Limite insuficiente");
                exibeFatura(listaDeCompra);
                valor = 0;
            } else {
                limiteCartao -= compra.getValorDaCompra();
                listaDeCompra.add(compra);
                System.out.println("Compra efetuada!");
                System.out.println("Digite 0 para sair ou 1 para continuar!");
                int escolha = sc2.nextInt();
                if (escolha == 1) {
                    valor = 1;
                } else {
                    exibeFatura(listaDeCompra);
                    valor = 0;
                }
            }
        }
    }


}