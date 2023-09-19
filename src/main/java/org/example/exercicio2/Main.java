package org.example.exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        NumeroNegativoOuPositivo numeroNegativoOuPositivo=new NumeroNegativoOuPositivo();

        try {
            System.out.println("Informe um número: ");
            int numero=scanner.nextInt();
            numeroNegativoOuPositivo.retornarNumeroPositivoOuNegativo(numero);
        }catch (InputMismatchException e){
            System.out.println("Informe apenas número inteiro");
        }
    }
}
