package org.juaro.factory;

public class TestFactory {

    public static void main(String[] args){
        EnemigoFactory enemigoFactory = new EnemigoFactory();
        Enemigo guerrero = enemigoFactory.createEnemigo("guerrero");
        Enemigo mago = enemigoFactory.createEnemigo("mago");
        guerrero.ataque();
        mago.ataque();
    }
}
