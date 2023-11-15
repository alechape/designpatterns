package org.juaro.abstractFactory;

public class Guerrero implements Enemigo {

    @Override
    public void ataque() {
        System.out.println("Guerrero ataca!");
    }
}
