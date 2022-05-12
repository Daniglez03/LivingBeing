public abstract class LivingBeing {
    private int health;
    private String name;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void born();
    public abstract void nourish();
    public abstract void communicate(LivingBeing interlocutor, String message);
    public abstract LivingBeing reproduction(LivingBeing partner);
    public abstract void die();
    public void refactor(int valor) {
        health += valor;
    }
}