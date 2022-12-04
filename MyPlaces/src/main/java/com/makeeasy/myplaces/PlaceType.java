package com.makeeasy.myplaces;

public enum PlaceType {

    OTROS ("Otros",0),
    RESTAURANTE ("Restaurante",2),
    BAR ("BAR",5),
    COPAS ("COPAS",4),
    ESPECTACULO ("ESPECTACULO",0),
    HOTEL ("HOTEL",0),
    COMPRAS ("COMPRAS",0),
    EDUCACION ("EDUCACION",0),
    DEPORTE ("DEPORTE",1),
    NAUTRALEZA ("NAUTRALEZA",0),
    GASOLINERIA ("GASOLINERIA",0);

    private final String text;
    private final int resource;

    PlaceType(String text, int resource) {
        this.text = text;
        this.resource = resource;
    }

    public String getText() {
        return text;
    }

    public int getResource() {
        return resource;
    }
}
