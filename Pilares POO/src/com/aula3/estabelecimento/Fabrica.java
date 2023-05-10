package com.aula3.estabelecimento;

import com.aula3.equipamentos.copiadora.Copiadora;
import com.aula3.equipamentos.digitalizadora.Digitalizadora;
import com.aula3.equipamentos.impresora.Impressora;
import com.aula3.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
