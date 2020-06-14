package com.company;

public class CriaConta {

    public static void main(String[] args) {
	    Conta primeiraConta = new Conta();
	    primeiraConta.saldo = 200.00d;
        System.out.println("primeira conta tem: " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("segunda conta tem: " + segundaConta.saldo);


        // aqui a referência para o objeto primairaConta foi passada à referência para o objeto segundConta
        // comos as duas referênmcias apontam para o mesmo objeto, é possível alterar o obj alterando qualquer uma das duas ref.
        segundaConta = primeiraConta;
        segundaConta.saldo = 400;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);



    }
}
