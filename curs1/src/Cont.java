public class Cont {
    //atribute
    String iban;
    String titular;
    double sold;

    //constructor
    Cont() {

    }

    //comportamente
    void afiseazaDetalii() {
        System.out.println("iban: " + iban + ", titulat: = " + titular + ", sold: " + sold);
    }

    boolean esteSoldulPozitiv() {
//        if(sold > 0) {                           //varianta 1
//            return true;
//        } else {
//            return false;
//        }

//        return sold > 0 ? true : false;          //varianta 2

        return sold > 0;                           //varianta 3
    }
}
