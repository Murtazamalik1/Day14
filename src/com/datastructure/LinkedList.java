package com.datastructure;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.key);
            temp = temp.next;
        }
    }
}
