package p1;

public class Exemplu1 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Popescu";
        employee.email = "popescu@test.com";
        employee.phone = "0756987412";
//        employee.address = "Bucuresti";  //address is private
        employee.printDetails();
    }
}
