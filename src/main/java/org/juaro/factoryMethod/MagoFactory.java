package org.juaro.factoryMethod;

public class MagoFactory extends EnemigoFactory {

    @Override
    public Enemigo createEnemigo() {
        return new Mago();
    }
}
