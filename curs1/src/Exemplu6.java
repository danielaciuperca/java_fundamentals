public class Exemplu6 {
    /*
        while(conditie) {

        }

     */
    public static void main(String [] args) {
        int n = 6;
        int suma = 0;

        int i = 1;
        while(i <= 6) {
            suma = suma + i;
            i++;
        }

        System.out.println("suma = " + suma);
    }
}
