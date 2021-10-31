package com.LinkedList;

/**
 * В классе создаем переменную start, которая является первым жлементов в списке. Присваеваем ей значение null
 */
public class MyList implements List {
    MyLinkedList start = null;


     @Override
    public void add(int meaning) {
        MyLinkedList newElement = new MyLinkedList(meaning);
        newElement.link = start;
        start = newElement;

    }

    /**
     * Нам нужно ввести независимую переменную start1, иначе метод print и getPosition
     * одновременно работать не будут. Цикл while после вызова в одном из данных методов второй раз(в другом методе)
     * просто не сработает. Другими словами переменная start у нас в процессе работы программы меняться не должна.
     */
    @Override
    public void print() {
        MyLinkedList start1 = start;
        while (start1 != null) {
            System.out.println(start1.meaning);
            start1 = start1.link;
        }

    }

   @Override
   public void getPosition(int meaning) {
        MyLinkedList start2 = start;
        int x = 0;
        while (start2 != null) {
            if (start2.meaning == meaning)
                System.out.println(x);
            start2 = start2.link;
            x++;

        }
    }
}


