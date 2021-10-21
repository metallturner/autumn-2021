package com.lesson;

public class Main {
    public static void main(String[] args) {
        Add add = new Add(5,5);
        Division division = new Division(5,5);
        Sub sub = new Sub(5,5);
        Multy multy = new Multy(5,5);
        add.calculate();
        division.calculate();
        sub.calculate();
        multy.calculate();

    }
}
