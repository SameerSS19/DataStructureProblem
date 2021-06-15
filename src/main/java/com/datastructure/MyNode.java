package com.datastructure;

public class MyNode<T>{
    private T data;
    private MyNode next;
    MyNode(){}
    // Constructor with node fields
    public MyNode(T key) {
        this.setData(data);
        this.setNext(null);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to the Data Structure Problem");
    }
}