package com.example.padroesdeprojeto1303.imovel.formas;

import lombok.Data;

@Data
public class Semicirculo implements Forma {

    private double raio;
    private double graus;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2.0) * (graus / 360);
    }
}
