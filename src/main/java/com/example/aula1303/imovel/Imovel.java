package com.example.padroesdeprojeto1303.imovel;

import com.example.padroesdeprojeto1303.imovel.formas.Forma;

import java.util.Collection;

public class Imovel implements Forma, Volume{
    public String id;
    public TipoUso tipoUso;
    public String proprietario;
    public String endereco;
//    public double areaTotal;
//    public double volumeInterno;
    private Collection<Comodo> comodos;

    @Override
    public double calcularVolume() {
        double area = 0;
        for (Comodo comodo : comodos) {
            area += comodo.calcularArea();
        }
        return area;
    }

    @Override
    public double calcularArea() {
        double volume = 0;
        for (Comodo comodo : comodos) {
            volume += comodo.calcularVolume();
        }
        return volume;
    }

    // .name = salva string no banco de dados
    public enum TipoUso { //nao pode criar outras instancias
        RESIDENCIAL(1), COMERCIAL(2), INDUSTRIAL(3), PUBLICO(4);

        private int cod;
        TipoUso(int cod) {
            this.cod = cod;
        }

        public int getCod() {
             return this.cod;
        }
    }
}
