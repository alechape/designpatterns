package org.juaro.abstractFactory.enemigo;

public class Mago implements Enemigo{
    @Override
    public void ataque() {
        System.out.println("Mago ataca!");
    }
}
