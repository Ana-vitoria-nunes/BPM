package org.example.exercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MostrarStatusNotas mostrarStatusNotas=new MostrarStatusNotas();

        boolean entradaValida = false;
        do {
            try {
                System.out.print("Digite a nota (entre 0 e 10): ");
                double nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    entradaValida = true;
                    mostrarStatusNotas.mostrarStaus(nota);
                } else {
                    System.out.println("Nota inválida. Digite uma nota entre 0 e 10 ou com virgula caso seja fracionado");
                }
            } catch (InputMismatchException e) {
                System.out.println("Informe apenas números válidos.");
                scanner.next();
            }
        } while (!entradaValida);
    }
}
