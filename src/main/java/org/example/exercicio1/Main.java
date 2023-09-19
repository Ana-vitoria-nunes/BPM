package org.example.exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MostrarNumeroMaior mostrarNumeroMaior = new MostrarNumeroMaior();

        try {
            System.out.println("Qual o primeiro numero: ");
            int num1 = scanner.nextInt();
            System.out.println("Qual o segundo numero: ");
            int num2 = scanner.nextInt();
            mostrarNumeroMaior.mostrarMaiorNumero(num1, num2);

        } catch (InputMismatchException e) {
            System.out.println("Informe apenas numeros inteiros");
        }
    }
}
