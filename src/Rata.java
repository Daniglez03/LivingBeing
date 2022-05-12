public class Rata extends LivingBeing{
    public Rata(String name) {
        System.out.println(" Rata " + name + " in progress");
        setName(name);
    }

    @Override
    public void born() {
        System.out.println(getName() + " Saliendo al campo...");
    }

    @Override
    public void nourish() {
        if (getHealth() >= 100) {
            System.out.println(getName() + " toy llena hdp");
        }else {
            System.out.println(getName() + " : Mmm que rico (" + getHealth() + ")");
            System.out.println("Ñam Ñam");

            refactor(10);
        }
    }

    @Override
    public void communicate(LivingBeing interlocutor, String message) {
        if (interlocutor instanceof Rata) {
            System.out.println(getName() + " : says : " + message);
            System.out.println(interlocutor.getName() + " : says : Opino lo mismo");
        }else {
            System.out.println(getName() + " : says : @!sd345?*");
            System.out.println(interlocutor.getName() + " : says : No te entiendo flaco");
            System.out.println(getName() + " : says : pos vete pal carajo " + interlocutor.getName());
        }
        refactor(-10);
    }

    @Override
    public LivingBeing reproduction(LivingBeing partner) {

        refactor(-30);

        if (partner.equals(this)) {
            System.out.println("La conciencia de " + getName() + " le dice: tas loco gay?");
            return null;
        }
        if (partner instanceof Rata) {
            System.out.println("Se apagan las luces...");
            return new Rata(" Bebé ");
        }else {
            System.out.println(getName() + " : says : Lo siento salí de una relación recientemente...");
            System.out.println(partner.getName() + "OK, soso");
            return null;
        }
    }

    @Override
    public void die() {
        setHealth(0);
        System.out.println("Una rata menos...");
    }
}
