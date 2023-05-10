package com.encapsulamento;
public class ComputadorPedrinho {
    public static void main(String[] args) {
        MsnMessenger msn = new MsnMessenger();

        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fcb = new FacebookMessenger();

        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegran tlg = new Telegran();

        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
