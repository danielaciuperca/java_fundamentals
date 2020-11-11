package main;

public class Exemplu1 {

    public static void main(String[] args) {
        Person person = new Person("Popescu", "1850213450017", "popescu@test.com");
        System.out.println(person);
        System.out.println(person.getClass());

        Person person2 = new Person("Ionescu", "2860415460025", "ionescu2@test.com");

        if(person == person2) {
            System.out.println("referintele sunt egale");
        } else {
            System.out.println("referintele nu sunt egale");
        }

        if(person.equals(person2)) {
            System.out.println("instantele p1 si p2 sunt egale");
        } else {
            System.out.println("instantele p1 si p2 nu sunt egale");
        }

        Person person3 = new Person("Ionescu", "2860415460025", "ionescu@test.com");

        if(person2 == person3) {
            System.out.println("referintele p2 si p3 sunt egale");
        } else {
            System.out.println("referintele p2 si p3 nu sunt egale");
        }

        if(person2.equals(person3)) {
            System.out.println("instantele p2 si p3 sunt egale");
        } else {
            System.out.println("instantele p2 si p3 nu sunt egale");
        }

        if(person2.equals("test")) {

        }

    }
}
