package p2;

import p4.Car;

public class Exemplu5 {

    public static void main(String[] args) {
        Brand brand = new Brand("Volvo","S60", false);
        Engine engine = new Engine(4, 200, "manual");

        Car car = new Car(brand, "grey", 50000, engine);
        System.out.println("car:" + car.brand.name + " " + car.brand.model + " " + car.color + " " + car.engine.transmission);


        Vehicle vehicle = new Car(brand, "white", 56000, engine);
        System.out.println(vehicle.brand + " " + vehicle.price);


        Item item = new Car(brand, "white", 56000, engine); //new Bicycle(brand);
        System.out.println(item.price);

        if(item instanceof Car) {
            Car car2 = (Car) item; //downcast
            System.out.println("car2: " + car2.brand.name + " " + car2.brand.model + " " + car2.color + " " + car2.engine.transmission);
            Item item2 = car2;  //upcast
            //in stanga egalului avem referinta
            //in dreapta egalului avem instanta
        }

        Bicycle bicycle = new Bicycle(new Brand("Pegas", "65", false));

        Item [] itemsInStock = new Item[10];
        itemsInStock[0] = car;
        itemsInStock[1] = bicycle;
        System.out.println("Items in stock:");
        for(Item i : itemsInStock) {
            if(i != null) {
                System.out.println(i.price);
            }
        }
    }
}
