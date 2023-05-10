package com.aula3.equipamentos.multifuncional;

import com.aula3.equipamentos.copiadora.Copiadora;
import com.aula3.equipamentos.digitalizadora.Digitalizadora;
import com.aula3.equipamentos.impresora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
    
}
