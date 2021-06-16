package com.datastructure;

public class Stack<T> {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    /* push the Node to stack */
    public void push(INode newNode) {
        myLinkedList.addFirst(newNode);
    }

    /* peek the top node in stack */
    public INode peek() {
        return myLinkedList.head;
    }
}
