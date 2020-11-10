package p4;

import p2.Brand;
import p2.Engine;
import p2.ImportDetails;
import p2.Vehicle;

public class Car extends Vehicle { //Car is-A Vehicle
    public String color;
    public Engine engine; //Car has-A Engine
    public ImportDetails importDetails;

    public Car(Brand brand, String color, double price, Engine engine) {
        super(brand);

        System.out.println("Constructor for Car was called.");

        this.color = color;
        this.price = price;
        this.engine = engine;
    }
}
