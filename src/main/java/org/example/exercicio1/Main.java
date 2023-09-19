package org.example.exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MostrarNumeroMaior mostrarNumeroMaior = new MostrarNumeroMaior();

        boolean entradaValida = false;

        do {
            try {
                System.out.print("Qual o primeiro numero: ");
                int num1 = scanner.nextInt();
                System.out.print("Qual o segundo numero: ");
                int num2 = scanner.nextInt();
                mostrarNumeroMaior.mostrarMaiorNumero(num1, num2);
                entradaValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Informe apenas números inteiros.");
                scanner.nextLine();
            }
        } while (!entradaValida);
    }
}
