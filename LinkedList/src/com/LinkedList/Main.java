package com.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
        list.getPosition(30);
    }
}
