public class Exemplu4 {

    /*
        switch(expresie) {
            case : ... break;
            case : ... break;
            case : ... break;
            default :  break;
        }


     */

    public static void main(String [] args) {
        String zi = "luni";

        switch (zi) {
            case "luni" :
                System.out.println("Astazi este luni");
                break;
            case "marti" :
                System.out.println("Astazi este marti");
                break;
            case "miercuri" :
                System.out.println("Astazi este miercuri");
                break;
            case "joi" :
                System.out.println("Astazi este joi");
                break;
            case "vineri" :
                System.out.println("Astazi este vineri");
                break;
            default : System.out.println("Nu este o zi din saptamana");
        }
    }
}
