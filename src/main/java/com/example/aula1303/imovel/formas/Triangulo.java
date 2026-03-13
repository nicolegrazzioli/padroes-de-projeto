package com.example.padroesdeprojeto1303.imovel.formas;

import lombok.Data;

@Data
public class Triangulo implements Forma {

    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }
}
