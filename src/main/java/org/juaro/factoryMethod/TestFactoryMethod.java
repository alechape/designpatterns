package org.juaro.factoryMethod;

public class TestFactoryMethod {

    public static void main(String[] args){

        Enemigo guerrero = new GuerreroFactory().createEnemigo();
        Enemigo mago = new MagoFactory().createEnemigo();
        guerrero.ataque();
        mago.ataque();
    }
}
