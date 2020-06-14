package com.company;

public class CriaCliente {
    public static void main(String[] args) {
        
        //é preciso instanciar para não causar nullpointer
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.titular = new Cliente();

        contaDaMarcela.titular.nome = "Marcela";

        System.out.println(contaDaMarcela.titular.nome);
    }
}
