package p2;

public class Dog {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    //supraincarcare = overloading

    public void eats(String food) {
        System.out.println(name + " eats " + food);
    }

    public void eats(String food, String momentOfDay) {
        System.out.println(name + " eats " + food + " " + momentOfDay);
    }

    public void eats(double quantity) {
        System.out.println(name + " eats " + quantity + " grams of food per day");
    }

    public void eats(String food, int meals) {
        System.out.println(name + " eats " + food + " " + meals + " times per day");
    }

    public void eats(int quantity, String food) {
        System.out.println(name + " eats " + food + " with quantity " + quantity);
    }
}
