package com.datastructure;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To LinkedList :");
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.display();
        System.out.println();

        LinkedList<Integer> linkedList1 = new LinkedList<>();

        linkedList1.add(56);
        linkedList1.add(30);
        linkedList.add(70);

        linkedList1.display();


    }
}
