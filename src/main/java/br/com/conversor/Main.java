package br.com.conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== CONVERSOR DE MOEDAS ====");
            System.out.println("1. USD para BRL");
            System.out.println("2. BRL para USD");
            System.out.println("3. EUR para BRL");
            System.out.println("4. BRL para EUR");
            System.out.println("5. GBP para BRL");
            System.out.println("6. BRL para GBP");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                System.out.print("Digite o valor a converter: ");
                double valor = scanner.nextDouble();
                conversor.converter(opcao, valor);
            }

        } while (opcao != 7);

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}