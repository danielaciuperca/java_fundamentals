public class Exemplu2 {

    // Primitive: byte, short, int, long, float, double, boolean, char

    /*
        declarare variabile
        atribuire valori
        initializare variabile
     */

    public static void main(String[] args) {
        byte number1 = 10; //initializare
        byte number2;      //declarare
        number2 = 15;      //atribuire VALOARE

        System.out.println(number1);
        System.out.println(number2);

        double number3 = 20.6;
        System.out.println(number3);

        boolean var1 = true;
        boolean var2 = false;
        System.out.println(var1);
        System.out.println(var2);

        char var3 = 'a';
        char var4 = '\u00A9';
        System.out.println(var4);
        var4 = 'b';
        System.out.println(var4);
        char var5;
//        System.out.println(var5);   variabila nu este initializata, deci nu o putem folosi
    }

}
