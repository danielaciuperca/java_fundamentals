package p2;

import p1.*;
import p1.p3.*;
import static p1.p3.Department.COMPANY;

public class Exemplu1 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Ionescu";
//        employee.email = "ionescu@test.com";  //email is protected
//        employee.phone = "0745698741";        //phone is default
//        employee.address = "Bucuresti";       //private
        employee.printDetails();

        Department department = new Department();
        System.out.println(COMPANY);
    }
}
