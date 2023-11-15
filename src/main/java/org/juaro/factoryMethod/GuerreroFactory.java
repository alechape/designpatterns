package org.juaro.factoryMethod;

public class GuerreroFactory extends EnemigoFactory{
    @Override
    public Enemigo createEnemigo() {
        return new Guerrero();
    }
}
