public class Angajat {
    String nume;
    int varsta = 16;
    String departament = "IT";

    static String companie = "ING";

    {
        //bloc de initializare
        System.out.println("varsta inainte de blocul de initializare: " + varsta);
        varsta = 18;
        System.out.println("varsta dupa blocul de initializare: " + varsta);
    }

    static {
        //bloc de initializare static
        System.out.println("companie inainte de blocul de initializare: " + companie);
        companie = "BCR";
        System.out.println("companie dupa de blocul de initializare: " + companie);
    }

    Angajat(String nume, int varsta, String departament) {
        System.out.println("valori atribute inainte de constructor: " + this.nume + ", " +
                this.varsta + ", " + this.departament);
        this.nume = nume;
        this.varsta = varsta;
        this.departament = departament;
        companie = "ING";
        System.out.println("valori atribute dupa constructor: " + this.nume + ", " +
                this.varsta + ", " + this.departament + ", " + companie);
    }
}
