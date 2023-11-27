package org.juaro.builder;

public class EnemigoBuilder {
    private String name;
    private String type;
    private int health;
    private int damage;
    private int endurance;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getEndurance() {
        return endurance;
    }

    public EnemigoBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EnemigoBuilder type(String type) {
        this.type = type;
        return this;
    }

    public EnemigoBuilder health(int health) {
        this.health = health;
        return this;
    }

    public EnemigoBuilder damage(int damage) {
        this.damage = damage;
        return this;
    }

    public EnemigoBuilder endurance(int endurance) {
        this.endurance = endurance;
        return this;
    }

    public Enemigo build() {
        Enemigo enemigo = new Enemigo();
        enemigo.setName(getName());
        enemigo.setType(getType());
        enemigo.setHealth(getHealth());
        enemigo.setEndurance(getEndurance());
        enemigo.setDamage(getDamage());
        return enemigo;
    }

}
