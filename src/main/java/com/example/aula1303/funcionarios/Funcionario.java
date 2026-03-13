package com.example.padroesdeprojeto1303.funcionarios;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return salario * 0.10;
    }
}
