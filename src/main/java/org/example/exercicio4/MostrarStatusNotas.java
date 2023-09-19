package org.example.exercicio4;

public class MostrarStatusNotas {

    public void mostrarStaus(double nota){
        if (nota >= 8) {
            System.out.println("Aprovado");
        } else if (nota >= 6) {
            System.out.println("Em recuperação");
        } else if (nota >= 0) {
            System.out.println("Reprovado");
        }
    }
}
