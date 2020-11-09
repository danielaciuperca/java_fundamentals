public class Punct {
    int x;
    int y;

    Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //metoda care sa calculeze distanta intre 2 puncte
    // Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) )
    static double calculeazaDistanta(int x1, int x2, int y1, int y2) {
        double distanta = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return distanta;
    }

    double calculeazaDistantaNonStatic(int x2, int y2) {
        double distanta = Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
        return distanta;
    }
}
