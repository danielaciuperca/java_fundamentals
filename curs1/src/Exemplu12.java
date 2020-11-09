public class Exemplu12 {

    public static void main(String[] args) {
        Dobanda d = new Dobanda("EUR", "IBAN123456");
        System.out.println(d.VALOARE + ", " + d.MONEDA);
//        d.VALOARE = 0.7;    //valoarea este constanta
//        d.MONEDA = "bla";   //MONEDA este constanta

        Dobanda d2 = new Dobanda("RON", "IBAN9746");
        System.out.println(d2.VALOARE + ", " + d2.MONEDA);
//        d2.VALOARE = 0.6;   //valoarea este constanta
//        d2.MONEDA = "bla";  //MONEDA este constanta

        System.out.println(Dobanda.BANCA);
//        Dobanda.BANCA = "BRD";   //BANCA este constanta


        final String salut = "Hello";
//        salut = "Buna";      //salut este constanta
    }
}
