package src.interfacce.estabelecimento;

import src.interfacce.equipamentos.copiadora.Copiadora;
import src.interfacce.equipamentos.copiadora.Xerox;
import src.interfacce.equipamentos.digitalizadora.Digitalizadora;
import src.interfacce.equipamentos.digitalizadora.Scanner;
import src.interfacce.equipamentos.impressora.Deskjet;
import src.interfacce.equipamentos.impressora.Impressora;
import src.interfacce.equipamentos.impressora.Laserjet;
import src.interfacce.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet desk = new Deskjet();
        Scanner scn = new Scanner();
        Xerox xrx = new Xerox();

        Impressora impressora = em;
        Impressora impressora1 = desk;
    //    Impressora impressora2 = scn;
    //    Impressora impressora3 = xrx;

        Digitalizadora digitalizadora = em;
    //    Digitalizadora digitalizadora1 = desk;
        Digitalizadora digitalizadora2 = scn;
    //    Digitalizadora digitalizadora3 = xrx;

        Copiadora copiadora = em;
    //    Copiadora copiadora1 = desk;
    //    Copiadora copiadora2 = scn;
        Copiadora copiadora3 = xrx;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
