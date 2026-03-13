package com.example.padroesdeprojeto1303.imovel;

import com.example.padroesdeprojeto1303.imovel.formas.Forma;
import lombok.Data;

import java.util.Collection;

@Data
public class Comodo implements Forma, Volume {
    private String id;
    public double peDireito; //altura
    private Collection<Forma> formas;

    @Override
    public double calcularArea() {
        double area = 0.0;
        for (Forma f : formas) {
            area += f.calcularArea();
        }
        return area;
    }

    @Override
    public double calcularVolume() {
        return area * peDireito;
    }
}
