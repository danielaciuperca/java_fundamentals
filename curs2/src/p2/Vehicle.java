package p2;

public class Vehicle extends Item {
    public Brand brand;  //Vehicle has-A Brand

    public Vehicle(Brand brand) {
        System.out.println("Contructor for Vehicle was called.");
        this.brand = brand;
    }
}
