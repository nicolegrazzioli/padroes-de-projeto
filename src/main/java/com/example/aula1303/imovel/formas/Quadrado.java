package com.example.padroesdeprojeto1303.imovel.formas;

public class Quadrado implements Forma {
    private double lado;

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}
