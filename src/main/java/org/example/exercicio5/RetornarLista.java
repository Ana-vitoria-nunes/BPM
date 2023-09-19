package org.example.exercicio5;

import java.util.Collections;
import java.util.List;

public class RetornarLista {

    public void retornarListaEmOrdem(List<Integer>numeros){
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Lista Ordenada em Ordem Decrescente:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
