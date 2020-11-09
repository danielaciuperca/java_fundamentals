public class Exemplu7 {
    /*
        do {
            ...
        } while(conditie);


     */

    public static void main(String[] args) {
        int n = 6;
        int suma = 0;

        int i = 1;
        do {
            suma = suma + 1;
            i++;
        } while(i <= 6);

        System.out.println("suma = " + suma);
    }
}
