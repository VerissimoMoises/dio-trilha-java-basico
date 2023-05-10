package com.aula2;

import com.apps.FacebookMessenger;
import com.apps.MsnMessenger;
import com.apps.ServicoMensagemInstantanea;
import com.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "tlg";

        if(appEscolhido.equals("msn")) {
            smi = new MsnMessenger();
        } else if(appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if(appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
