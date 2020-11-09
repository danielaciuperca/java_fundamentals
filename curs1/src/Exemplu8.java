public class Exemplu8 {

    public static void main(String [] args) {
        int x = 10;

        Cont cont = new Cont();
        cont.iban = "IBAN123456";
        cont.titular = "Popescu";
        cont.sold = 1000;

        System.out.println(cont.iban);
        System.out.println(cont.titular);
        System.out.println(cont.sold);
        cont.afiseazaDetalii();

        Cont cont2 = new Cont();
        cont2.iban = "IBAN789654";
        cont2.titular = "Ionescu";
        cont2.sold = 2000;
        System.out.println(cont2.iban);
        System.out.println(cont2.titular);
        System.out.println(cont2.sold);
        cont2.afiseazaDetalii();

        System.out.println("Sold pozitiv: " + cont2.esteSoldulPozitiv());

        new Cont().afiseazaDetalii();
    }
}
