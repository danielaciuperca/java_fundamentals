package p2;

public class Exemplu4 {

    public static void main(String[] args) {
        int [] v1 = new int[10];

        v1[0] = 5;
        v1[1] = 7;
        v1[2] = 6;

        System.out.println("v1[0] = " + v1[0]);

        for(int i = v1.length - 1; i >= 0; i--) {
            System.out.print(v1[i] + " ");
        }

        System.out.println("");

        for(int element : v1) {
            System.out.print(element + " ");
        }

        System.out.println();

        //v1[10] = 3;

        int [][] m1 = new int[5][];

        m1[0] = new int[3];
        m1[1] = new int[5];
        m1[2] = new int[1];
        m1[3] = new int[4];
        m1[4] = new int[3];

        m1[0][0] = 10;
        //m1[2][5] = 8;
        m1[4][1] = 8;

        for(int[] line : m1) {
            for(int element : line) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
