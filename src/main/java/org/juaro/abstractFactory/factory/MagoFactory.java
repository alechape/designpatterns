package org.juaro.abstractFactory.factory;

import org.juaro.abstractFactory.arma.Arma;
import org.juaro.abstractFactory.arma.Baston;
import org.juaro.abstractFactory.armadura.Armadura;
import org.juaro.abstractFactory.armadura.Tunica;
import org.juaro.abstractFactory.enemigo.Enemigo;
import org.juaro.abstractFactory.enemigo.Mago;

public class MagoFactory extends EnemigoAbstractFactory{
    @Override
    public Enemigo crearEnemigo() {
        return new Mago();
    }

    @Override
    public Armadura crearArmadura() {
        return new Tunica();
    }

    @Override
    public Arma crearArma() {
        return new Baston();
    }
}
