package org.juaro.factory;

public class EnemigoFactory {

    public Enemigo createEnemigo(String type){
        if (type.equalsIgnoreCase("guerrero"))
            return new Guerrero();
        else if (type.equalsIgnoreCase("mago"))
            return new Mago();
        else
            return null;
    }
}
