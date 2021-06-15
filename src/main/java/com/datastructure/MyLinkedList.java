package com.datastructure;

public class MyLinkedList<T> {
    public INode<T> head;
    public INode<T> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

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
