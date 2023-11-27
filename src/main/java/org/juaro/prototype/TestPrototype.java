package org.juaro.prototype;

public class TestPrototype {
    public static void main(String[] args){
        Guerrero g1 = new Guerrero(100, 100, 100);
        Guerrero g2 = (Guerrero) g1.clonar();
        System.out.println(g1);
        System.out.println(g2);
        System.out.println("=============");
        g2.setSalud(0);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println("=============");

        Mago m1 = new Mago(100,100,100);
        Mago m2 = (Mago) m1.clonar();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println("=============");
        m2.setSalud(0);
        System.out.println(m1);
        System.out.println(m2);

    }
}
