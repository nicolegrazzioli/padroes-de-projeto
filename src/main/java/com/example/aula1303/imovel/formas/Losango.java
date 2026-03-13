package com.example.padroesdeprojeto1303.imovel.formas;

import lombok.Data;

@Data
public class Losango implements Forma {

    private double diagonalMaior;
    private double diagonalMenor;

    @Override
    public double calcularArea() {
        return diagonalMaior * diagonalMenor / 2.0;
    }
}
