package org.juaro.abstractFactory.armadura;

public class ArmaduraPesada implements Armadura{
    @Override
    public void protege() {
        System.out.println("Armadura pesada protege!");
    }
}
