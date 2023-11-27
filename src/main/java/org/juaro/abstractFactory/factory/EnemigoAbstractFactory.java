package org.juaro.abstractFactory.factory;

import org.juaro.abstractFactory.arma.Arma;
import org.juaro.abstractFactory.armadura.Armadura;
import org.juaro.abstractFactory.enemigo.Enemigo;

public abstract class EnemigoAbstractFactory {

    public abstract Enemigo crearEnemigo();
    public abstract Armadura crearArmadura();
    public abstract Arma crearArma();

}
