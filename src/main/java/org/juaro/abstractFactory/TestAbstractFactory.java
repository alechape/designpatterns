package org.juaro.abstractFactory;

import org.juaro.abstractFactory.arma.Arma;
import org.juaro.abstractFactory.armadura.Armadura;
import org.juaro.abstractFactory.factory.EnemigoAbstractFactory;
import org.juaro.abstractFactory.factory.GuerreroFactory;
import org.juaro.abstractFactory.enemigo.Enemigo;
import org.juaro.abstractFactory.factory.MagoFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        EnemigoAbstractFactory factory;

        factory = new GuerreroFactory();
        Enemigo guerrero = factory.crearEnemigo();
        Armadura armaduraPesada = factory.crearArmadura();
        Arma hacha = factory.crearArma();
        guerrero.ataque();
        armaduraPesada.protege();
        hacha.haceDanio();

        factory = new MagoFactory();
        Enemigo mago = factory.crearEnemigo();
        Armadura tunica = factory.crearArmadura();
        Arma baston = factory.crearArma();
        mago.ataque();
        tunica.protege();
        baston.haceDanio();
    }
}
