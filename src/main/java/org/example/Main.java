package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsumoDeCombustivel consumoDeCombustivel = new ConsumoDeCombustivel();
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Distância total percorrida (em Km): ");
                int distancia = scanner.nextInt();

                System.out.print("Total de combustível consumido (em litros): ");
                double combustivel = scanner.nextDouble();

                consumoDeCombustivel.consumoMedioDeCombustivel(distancia, combustivel);
                entradaValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira apenas números válidos.");
                scanner.nextLine();
            }
        } while (!entradaValida);
    }
}