package org.example;
public class ConsumoDeCombustivel {
    public  void consumoMedioDeCombustivel(int distancia, double combustivel){

        double consumoMedio = distancia / combustivel;
        System.out.printf("Consumo médio: %.3f km/l%n", consumoMedio);
    }
}
