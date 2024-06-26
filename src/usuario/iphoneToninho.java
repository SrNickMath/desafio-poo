package usuario;

import equipamentos.iphone.Iphone;

//Classe criada para simular operações realizadas no iPhone

public class iphoneToninho {
    public static void main(String[] args) {
        Iphone iphoneDoToninho = new Iphone();

        iphoneDoToninho.tocar();
        iphoneDoToninho.pausar();
        iphoneDoToninho.selecionarMusica("Exemplo Música");
        iphoneDoToninho.ligar("+55 00 98765-4321");
        iphoneDoToninho.atender();
        iphoneDoToninho.iniciarCorreioVoz();
        iphoneDoToninho.exibirPagina("exemplourl.com");
        iphoneDoToninho.adicionarNovaAba();
        iphoneDoToninho.atualizarPagina();
    }
}
