package com.company;

public class TestaMetodos {

    public static void main(String[] args) {
        Conta conta01 = new Conta();
        System.out.println("saldo da conta 01: " + conta01.saldo);
        conta01.saca(10);
        conta01.deposita(5);
        System.out.println("saldo da conta 01: " + conta01.saldo);

        Conta conta02 = new Conta();
        System.out.println("saldo da conta 02: " + conta02.saldo);

        conta01.transfere(5, conta02);

        System.out.println("saldo da conta 01: " + conta01.saldo);
        System.out.println("saldo da conta 02: " + conta02.saldo);
    }
}
