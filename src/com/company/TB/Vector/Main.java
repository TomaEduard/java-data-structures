package com.company.TB.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        // intArray[i] = 20, 35
        /*
            If a thread-safe implementation is no needed, it is recommended
            to use ArrayList in place of Vector
        */

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Marry", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

    }
}
