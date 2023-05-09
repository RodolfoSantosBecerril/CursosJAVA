package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {
        //System.out.println("Dia 1 " + Dias.Lunes);
       // indicarDiaSemana(Dias.Lunes);
        System.out.println("Continente no 1-"+Continentes.Africa);
        System.out.println("No de paises en el primer continente-"+Continentes.Africa.getPaises());  
        System.out.println("Continente no 4-"+Continentes.America);
        System.out.println("No de paises en el cuarto continente-"+Continentes.America.getPaises());    
    }

    public static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case Lunes:
                System.out.println("Pimer Dia de la semana");
                break;
            case Martes:
                System.out.println("Segundo Dia");
                break;

        }
    }

}
