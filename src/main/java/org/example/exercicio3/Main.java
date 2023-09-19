package org.example.exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ConsoanteOuVogal consoanteOuVogal=new ConsoanteOuVogal();


        char letra = 0;
        boolean entradaValida = false;

        do {
            System.out.print("Informe uma letra: ");
            String entrada = scanner.nextLine();

            try {
                if (entrada.length() == 1) {
                    letra = entrada.charAt(0);
                    letra = Character.toLowerCase(letra);

                    if (letra >= 'a' && letra <= 'z') {
                        entradaValida = true;
                        consoanteOuVogal.retornarConsoanteOuVogal(letra);
                    } else {
                        System.out.println("Por favor, digite apenas uma letra válida.");
                    }
                } else {
                    System.out.println("Por favor, digite apenas uma letra.");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro. Por favor, tente novamente.");
            }

        } while (!entradaValida);
    }
}
