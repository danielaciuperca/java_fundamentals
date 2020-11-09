public class Exemplu3 {
    /*
            Structuri decizionale

            if(conditie) {
                instructiuni 1
            } else {
                instructiuni 2
            }

            switch
     */
    public static void main(String[] args) {
        int x = 9;

        if(x % 2 == 0) {
            System.out.println("x este par");
        } else {
            System.out.println("x este impar");
        }

        if(x > 0) {
            System.out.println("x este pozitiv");
            if(x % 3 == 0) {
                System.out.println("x este multiplu de 3");
            }
        }
        System.out.println("hello");
    }
}
