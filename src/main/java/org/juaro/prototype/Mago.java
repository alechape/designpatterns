package org.juaro.prototype;

public class Mago extends Enemigo{

    private int mana;

    public Mago(int salud, int danio, int mana) {
        super(salud, danio);
        this.mana = mana;
    }

    public Mago(Mago mago) {
        super(mago);
        if(mago!=null)
            setMana(mago.getMana());
    }

    public Mago(Enemigo enemigo, int mana) {
        super(enemigo);
        this.mana = mana;
    }

    @Override
    public Enemigo clonar() {
        return new Mago(this);
    }
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "mana=" + mana +
                ", salud=" + salud +
                ", danio=" + danio +
                '}';
    }

}
