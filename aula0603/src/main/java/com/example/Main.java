package com.example;

/*
*  == compara referencias
* .equals() compara valor interno do objeto (tipo primitivo) -- usar esse
* inteiros sao imutaveis, entao retorna a mesma referencia (economizar memoria) --> funciona com == até 128 (+128 não usa Integer puro)
* tudo que é static passa a ser da classe (por definicao eh estatica, exceto inner classes = classe dentro de classe)
*/

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Integer i = 200;
        Integer b = 200; //2 objetos imutaveis distintos, refs diferentes
        // efeitoColateral(i);
        // System.out.println(i); //10
        // System.out.println(i == 10); // verifica se os ponteiros apontam para o mesmo lugar
        
        // ---------------------------------------

        //compara objetos
        System.out.println(i.equals(b));
        System.out.println(i == b);

        // ---------------------------------------

        InnerClass in = new InnerClass();
        in.nome = "xuxa";
        efeitoColateral(in);
        System.out.println(in.nome); //imprime xuxu

        // ---------------------------------------

        String s1 = "hello";
        // String s2 = "hello"; //string eh imutavel
        String s3 = new String("hello"); //força a criar um objeto novo (cria 2 strings), força a nao usar o intern
        // System.out.println(s1 == s2); //true -- se for o mesmo valor, retorna ref para a mesma string
        System.out.println(s1 == s3); //false

        String s2 = " world";
        s1.concat(" world"); //concatena world no s1 --> s1 nao muda, um objeto novo eh criado --> s1 = "hello"
        System.out.println(s1); //hello
        String s3 = s1.concat(" world");
        System.out.println(s2); //hello world

    }

    public static void efeitoColateral /*(int bola)*/ (InnerClass in) { //primitivo (int) = passa por copia
        // bola = 1000; //nao causa efeito colateral
        in.nome = "xuxu";
    }

    public static class InnerClass {
        /*final*/ String nome; //com final a classe passa a ser imutavel
    }
}