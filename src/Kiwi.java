public class Kiwi extends LivingBeing{

    public Kiwi(String name) {
        System.out.println("Kiwi " + name + " in process...");
        setName(name);
    }

    @Override
    public void born() {
        System.out.println(getName() + " : Breaking my egg");
        setHealth(100);
    }

    @Override
    public void nourish() {
        if (getHealth() >= 100) {
            System.out.println(getName() + " Mira con desprecio y pasa de largo");
        }else {
            System.out.println(getName() + " : Mmm que rico (" + getHealth() + ")");
            System.out.println("Ñam Ñam");

            refactor(1);
        }
    }

    @Override
    public void communicate(LivingBeing interlocutor, String message) {
        if (interlocutor instanceof Kiwi) {
            System.out.println(getName() + " : says : " + message);
            System.out.println(interlocutor.getName() + " : says : ajá");
        }else {
            System.out.println(getName() + " : says : @!sd345?*");
            System.out.println(interlocutor.getName() + " : says : Tu padre por si acaso...");
        }
        refactor(-10);
    }

    @Override
    public LivingBeing reproduction(LivingBeing partner) {
        refactor(-50);

        if (partner.equals(this)) {
            System.out.println("La conciencia de " + getName() + " le dice: que no puede hacerlo");
            return null;
        }
        if (partner instanceof Kiwi) {
            System.out.println("Se apagan las luces...");
            return new Kiwi(" Bebé ");
        }else {
            System.out.println(getName() + " : says : Lo siento salí de una relación recientemente...");
            System.out.println(partner.getName() + "OK, soso");
            return null;
        }
    }

    @Override
    public void die() {
        setHealth(0);
        System.out.println("En el suelo yace " + getName() + " que vivió una maravillosa vida");
    }
}
