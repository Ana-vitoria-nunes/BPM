package org.example.exercicio3;

public class ConsoanteOuVogal {

    public void retornarConsoanteOuVogal(char letra){
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra informada é uma vogal.");
        } else {
            System.out.println("A letra informada é uma consoante.");
        }
    }

}
