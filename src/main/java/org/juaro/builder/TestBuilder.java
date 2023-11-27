package org.juaro.builder;

public class TestBuilder {

    public static void main (String[] args){
        Enemigo enemigo = Enemigo.builder()
                .name("Homero")
                .type("Guerrero")
                .build();

        System.out.println(enemigo.toString());

        enemigo = Enemigo.builder()
                .name("Bart")
                .type("Patinador")
                .health(12)
                .endurance(10)
                .build();
        System.out.println(enemigo.toString());
    }

}
