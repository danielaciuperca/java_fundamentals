package p2;

public class Exemplu3 {

    public static void main(String[] args) {
        Dog d1 = new Dog("Nero");
        d1.eats("meat");
        d1.eats("cheese", "in the morning");
        d1.eats(360.5);
        d1.eats("meat", 2);
        d1.eats(5, "slice of bread");
    }
}
