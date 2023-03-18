package com.datastructure;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To LinkedList :");
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(70);
        linkedList.push(56);

        linkedList.insert(30);

       // linkedList.pop();
        linkedList.popLast();
        linkedList.display();


    }
}
