public class Exemplu10 {

    public static void main(String[] args) {
        Angajat a = new Angajat("Popescu", 0, "HR");

        System.out.println(a.nume);
        System.out.println(a.varsta);
        System.out.println(a.departament);

        a.nume = "Ionescu";
        System.out.println(a.nume);
    }
}
