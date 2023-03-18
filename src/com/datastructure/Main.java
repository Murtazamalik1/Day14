package com.datastructure;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To LinkedList :");
        LinkedList<Integer> linkedList = new LinkedList<>();
        Node<Integer> myFirstNode = new Node<>(56);
        linkedList.head = myFirstNode;
        Node<Integer> mySecondNode = new Node<>(30);
        myFirstNode.next = mySecondNode;
        Node<Integer> myThirdNode = new Node<>(70);
        mySecondNode.next = myThirdNode;
         linkedList.display();
    }
}
