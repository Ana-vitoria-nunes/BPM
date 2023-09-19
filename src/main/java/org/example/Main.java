package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calcular calcular=new Calcular();

        boolean entradaValida = false;
        int numero;
        do {
            try {
                System.out.print("Digite um número inteiro entre 0 e 12: ");
                String input = scanner.next();
                numero = Integer.parseInt(input);

                if (numero >= 0 && numero <= 12) {
                    entradaValida = true;
                    System.out.println(numero + "! = " + calcular.calcularFatorial(numero));
                } else {
                    System.out.println("O número deve estar entre 0 e 12.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro válido.");
            }
        } while (!entradaValida);
    }
}