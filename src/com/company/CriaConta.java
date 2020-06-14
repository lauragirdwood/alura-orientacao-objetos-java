package com.company;

public class CriaConta {

    public static void main(String[] args) {
	    Conta primeiraConta = new Conta();
	    primeiraConta.setSaldo(200);
        System.out.println("primeira conta tem: " + primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.setSaldo(50);
        System.out.println("segunda conta tem: " + segundaConta.getSaldo());


        // aqui a referência para o objeto primairaConta foi passada à referência para o objeto segundConta
        // comos as duas referênmcias apontam para o mesmo objeto, é possível alterar o obj alterando qualquer uma das duas ref.
        segundaConta = primeiraConta;
        segundaConta.setSaldo(400);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());



    }
}
