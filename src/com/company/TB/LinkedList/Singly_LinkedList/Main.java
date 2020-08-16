package com.company.TB.LinkedList.Singly_LinkedList;

public class Main {

    public static void main(String[] args) {

        /*
            - Singly Linked List is best use for insert and remove items of the front of the list
            - SLL can continue to grow without resize the list(like Array), you have reference of next unit
        */

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        //remove
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}
