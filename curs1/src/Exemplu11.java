public class Exemplu11 {

    public static void main(String[] args) {
        System.out.println("distanta = " + Punct.calculeazaDistanta(1, 2, 8, 9));

        Punct p1 = new Punct(5, 6);
        Punct p2 = new Punct(9, 4);

        p1.calculeazaDistantaNonStatic(p2.x, p2.y);
    }
}
