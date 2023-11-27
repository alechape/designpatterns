package org.juaro.abstractFactory.factory;

import org.juaro.abstractFactory.arma.Arma;
import org.juaro.abstractFactory.arma.Hacha;
import org.juaro.abstractFactory.armadura.Armadura;
import org.juaro.abstractFactory.armadura.ArmaduraPesada;
import org.juaro.abstractFactory.enemigo.Enemigo;
import org.juaro.abstractFactory.enemigo.Guerrero;

public class GuerreroFactory extends EnemigoAbstractFactory{

    @Override
    public Enemigo crearEnemigo() {
        return new Guerrero();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraPesada();
    }

    @Override
    public Arma crearArma() {
        return new Hacha();
    }
}
