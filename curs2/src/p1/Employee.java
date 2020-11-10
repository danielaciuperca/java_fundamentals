package p1;

public class Employee {
    public String name;
    protected String email;
    String phone;
    private String address;

    public Employee() {

    }

    public void printDetails() {
        System.out.println(name + ", " + email + ", " + phone + ", " + address);
    }
}
