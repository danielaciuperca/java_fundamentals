public class Dobanda {
    final double VALOARE = 0.3;
    final String MONEDA;
    String iban;

    static final String BANCA = "ING";

    Dobanda(String moneda, String iban) {
        this.MONEDA = moneda;
        this.iban  = iban;
    }
}
