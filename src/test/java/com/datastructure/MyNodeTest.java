package com.datastructure;
import org.junit.Assert;
import org.junit.Test;
public class MyNodeTest {
    @Test
    public void givenCallShouldPrintWelcomeMessage() {
    MyNode myFirstNode = new MyNode();
    myFirstNode.printWelcomeMessage();
}

    /* Created Simple Linked List */
    @Test
    public void GivenThreeNumbersWhenLinkedShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode));
        Assert.assertTrue(result);
    }
}
