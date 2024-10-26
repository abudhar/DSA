package com.dsa.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int lenght;

    class Node {
        int value;
        Node node;
        public Node (int value) {
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
    }

}