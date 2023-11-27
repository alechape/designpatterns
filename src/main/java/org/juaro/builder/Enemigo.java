package org.juaro.builder;

public class Enemigo {
    private String name;
    private String type;
    private int health;
    private int damage;
    private int endurance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public static EnemigoBuilder builder(){
        return new EnemigoBuilder();
    }
    @Override
    public String toString() {
        return "Enemigo{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", endurance=" + endurance +
                '}';
    }
}
