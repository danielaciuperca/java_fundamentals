import java.text.MessageFormat;

public class Exemplu5 {
    /*
           Structuri repetitive

           for(initializare; conditia logica; control) {

           }


           while

           do while

     */

    public static void main(String [] args) {
        int n = 6;
        int suma = 0;


        for(int i = 1; i <= n; i++) {
            suma = suma + i;
        }

        System.out.println(suma);

        int a = 10;
        int b = ++a - 5;
        System.out.println(b);
        System.out.println(a);

        int c = 3;
        c += 7; // c = c + 7
        System.out.println("c = " + c);

        boolean boolean1 = true;
        System.out.println("b = " + boolean1);

        String test = "acesta este testul {0}, {1}, {2}";
        System.out.println(MessageFormat.format(test, 5, 6, 7));


//        for(;;) {                              //bucla infinita
//            System.out.println("hello");
//        }
    }
}
