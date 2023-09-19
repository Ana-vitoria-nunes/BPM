package org.example.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RetornarLista retornarLista=new RetornarLista();
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);
        numeros.add(7);
        numeros.add(15);

        retornarLista.retornarListaEmOrdem(numeros);
    }
}
