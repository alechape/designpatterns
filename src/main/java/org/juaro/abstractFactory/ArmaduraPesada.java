package org.juaro.abstractFactory;

public class ArmaduraPesada implements Armadura{
    @Override
    public void protege() {
        System.out.println("Armadura pesada protege!");
    }
}
