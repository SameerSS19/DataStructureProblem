package com.datastructure;

public class MyLinkedList<T> {
    public INode<T> head;
    public INode<T> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /* Add First */
    public void addFirst(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (head == null) {
            head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    /* Add Last */
    public void addLast(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (tail == null) {
            tail = newNode;
        } else {
            this.tail.setNext(newNode);
            tail = newNode;
        }
    }
    /*Insert Node*/
    public void insertNode(INode<Integer> myFirstNode, INode<Integer> mySecondNode) {
        mySecondNode.setNext(myFirstNode.getNext());
        myFirstNode.setNext(mySecondNode);
    }

    /* Delete/Pop First Node */
    public void pop() {
        this.head = this.head.getNext();
    }

    public void printMyNodes() {
        INode tempNode = this.head;
        StringBuffer displayNode = new StringBuffer("My Nodes: ");
        while (tempNode.getNext() != null) {
            displayNode.append(tempNode.getData());
            if (!tempNode.equals(this.tail)) {
                displayNode.append("->");
            }
            tempNode = tempNode.getNext();
        }
        displayNode.append(tempNode.getData());
        System.out.println(displayNode);

    }
}
