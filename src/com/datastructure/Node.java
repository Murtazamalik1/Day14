package com.datastructure;

public class Node<T> {

    public T data;
    T key;
    Node<T> next;

    public Node(T key){
        this.key = key;
    }
}
