package com.company.TB.LinkedList.JDK_LinkedList;

import com.company.TB.LinkedList.Singly_LinkedList.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        /*

         */

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();

        System.out.println("*************************** Add Employees on front of the LL -> list.addFirst(janeJones);");
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        System.out.print("HEAD => ");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print(" <=>");
        }
        System.out.println(" null");

        System.out.println("*************************** Add an Employee to the end of LL -> list.add(billEnd);");
        list.add(billEnd);
        System.out.print("HEAD => ");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print(" <=>");
        }
        System.out.println(" null");


        System.out.println("*************************** Remove First -> list.removeFirst();");
        list.removeFirst();
        System.out.print("HEAD => ");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print(" <=>");
        }
        System.out.println(" null");

        System.out.println("*************************** Remove Last -> list.removeLast();");
        list.removeLast();
        System.out.print("HEAD => ");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print(" <=>");
        }
        System.out.println(" null");


    }
}













