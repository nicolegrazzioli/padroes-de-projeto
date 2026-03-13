package com.example.padroesdeprojeto1303.funcionarios;

import static sun.tools.jconsole.Version.print;

public class TesteHeranca {

    public class A {

    }
    public class B extends A {}


    public TesteHeranca() {
        A a = new A();
        B b = new B();
        A b1 = new B();

        print(a);
        print(b);
        print(b1);

    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(1000);
        Funcionario funcionario = gerente;
        System.out.println(gerente.getBonificacao());
        System.out.println(funcionario.getBonificacao());
    }
}
