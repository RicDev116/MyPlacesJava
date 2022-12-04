package com.makeeasy.myplaces;

public class Main {
    public static void main(String[] main){
        Place lugar = new Place(
            "Escuela Leonardo Bravo",
            "Peralvillo Mexico DF",
            -0.166093,
            39.995656,
            PlaceType.EDUCACION,
            962849300,
            "https://ilb.mx/",
            "Uno d los mejores lugares para formarse",
            3
        );

        System.out.println(lugar.toString());
    }
}
