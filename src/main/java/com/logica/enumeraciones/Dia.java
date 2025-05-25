package com.logica.enumeraciones;

public enum Dia {

    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    public void diaSemana(int dia) {
        if (dia == 1) {
            System.out.println(Dia.LUNES);
        } else if (dia == 2) {
            System.out.println(Dia.MARTES);
        } else if (dia == 3) {
            System.out.println(Dia.MIERCOLES);
        } else if (dia == 4) {
            System.out.println(Dia.JUEVES);
        } else if (dia == 5) {
            System.out.println(Dia.VIERNES);
        } else if (dia == 6) {
            System.out.println(Dia.SABADO);
        } else if (dia == 7) {
            System.out.println(Dia.DOMINGO);
        }
    }

}


