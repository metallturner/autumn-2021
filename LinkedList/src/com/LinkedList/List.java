package com.LinkedList;

public interface List {
    /**
     * Метод позволяет добавлять новый элемент в список
     * @param meaning - значение которое мы хотим передать в элемент
     */
    void add(int meaning);

    /**
     * Метод позволяет вывести значения всех элементов в списке
     */
    void print();

    /**
     * метод выводит на экран номер места, на котором стоит элемент в списке
     * @param meaning - значение элемента
     */
    void getPosition(int meaning);
}
