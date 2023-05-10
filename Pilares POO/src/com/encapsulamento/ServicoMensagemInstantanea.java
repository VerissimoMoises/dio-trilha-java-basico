package com.encapsulamento;

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        // Primeiro confirma se esta conectado a internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN messenger");
        // Depois de enviada, a mensagem é salva no histórico
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    // Metodos privados, visiveis apenas pela propria classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
