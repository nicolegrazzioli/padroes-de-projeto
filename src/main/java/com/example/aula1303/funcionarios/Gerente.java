package com.example.padroesdeprojeto1303.funcionarios;

public class Gerente extends Funcionario {
    private String senha;
    private int numFuncionariosGerenciados;

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.15;
    }

    public static void main(String[] args) {
//        new Gerente();
    }

    public Gerente() {

    }
}
