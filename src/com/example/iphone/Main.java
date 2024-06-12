package com.example.iphone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Teste do Reprodutor Musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Teste do Aparelho Telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste do Navegador na Internet
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
