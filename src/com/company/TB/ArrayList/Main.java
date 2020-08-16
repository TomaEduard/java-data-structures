package com.company.TB.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        // intArray[i] = 20, 35
        /*
            ArrayList is good for:
            - If you want the index of the element of the list
            - Literate all item sof te list

            ArrayList it's not so good for:
            (ArrayList will create a new one if delete/add an element on list)
            - Inserting item(s) into the list if isn't the end
            (because element will be shifted around and consume lot of memory)
            - Remove
            - Access the item in the list if don't have index
        */

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Marry", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        // Old version
//        employeeList.forEach(employee -> System.out.println(employee));
        employeeList.forEach(System.out::println);

        System.out.println(System.lineSeparator());

        System.out.println("*************************** get 1 element");
        System.out.println(employeeList.get(1));

        System.out.println(System.lineSeparator());

        System.out.println("*************************** check if list is empty");
        System.out.println(employeeList.isEmpty());

        System.out.println(System.lineSeparator());

        System.out.println("*************************** replace [index[1], new Employee(x,y,z)]");
        employeeList.set(1, new Employee("John", "Adams", 4567));
        employeeList.forEach(System.out::println);

        System.out.println(System.lineSeparator());


        System.out.println("*************************** size of the arrayList");
        System.out.println(employeeList.size());

        System.out.println(System.lineSeparator());

        System.out.println("*************************** add in specific position '3'");
        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(System.out::println);

        System.out.println(System.lineSeparator());

        System.out.println("*************************** Make an Array from ArrayList;");
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println(System.lineSeparator());

        System.out.println("*************************** if the arrayList contains - employeeList.contains");
        System.out.println(employeeList.contains(new Employee("Marry", "Smith", 22)));

        System.out.println(System.lineSeparator());

        System.out.println("*************************** find index of element - employeeList.indexOf");
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        System.out.println(System.lineSeparator());

        System.out.println("*************************** remove an element of the arrayList - employeeList.remove(index)");
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("********** remove index 2");
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
