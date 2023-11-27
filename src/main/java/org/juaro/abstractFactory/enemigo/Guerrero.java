package org.juaro.abstractFactory.enemigo;

public class Guerrero implements Enemigo {

    @Override
    public void ataque() {
        System.out.println("Guerrero ataca!");
    }
}
