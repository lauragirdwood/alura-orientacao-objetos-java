package com.company;

public class CriaCliente {
    public static void main(String[] args) {
        //é preciso instanciar para não causar nullpointer
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.setTitular(new Cliente());

        contaDaMarcela.getTitular().setNome("Marcela");

        System.out.println(contaDaMarcela.getTitular().getNome());
    }
}
