public class Main {

    public static void main(String[] args) {
	    Kiwi Lucas = new Kiwi("Lucas");
        Lucas.born();
        Lucas.nourish();

        Kiwi lucre = new Kiwi("Lucre");
        lucre.born();
        Lucas.communicate(lucre, "Hola flaca, eres nueva por aquí?");

        lucre.communicate(Lucas, "No eres feo para ser un kiwi");

        Lucas.nourish();

        Kiwi Churumbel = (Kiwi) Lucas.reproduction(Lucas);
        Kiwi Hermanito = (Kiwi) Lucas.reproduction(lucre);

        Lucas.die();

        System.out.println("");
        System.out.println("");
        ///////////////////////////////////

        Rata Ratatouille = new Rata("Ratatouille");

        Ratatouille.born();
        Ratatouille.communicate(Lucas, "tss ey, q coño eres?");
        Rata Daisy = new Rata("Daisy");
        Daisy.born();
        Ratatouille.communicate(Daisy, "Oye eres una rata ehhh");
        Daisy.communicate(Ratatouille, " Tu también, y muy guapo por cierto");
        Ratatouille.die();
    }
}
