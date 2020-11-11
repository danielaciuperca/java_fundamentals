package main;

public class Person {
    public String name;
    public String cnp;
    public String email;

    public Person(String name, String cnp, String email) {
        this.name = name;
        this.cnp = cnp;
        this.email = email;
    }

    @Override //adnotare
    public String toString() {
        return name + "/" + cnp + "/" + email;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            Person person = (Person) obj;

            if(name.equals(person.name) && cnp.equals(person.cnp)) {
               return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
