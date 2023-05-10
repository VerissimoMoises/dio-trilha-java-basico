package com.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN messenger");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
}
