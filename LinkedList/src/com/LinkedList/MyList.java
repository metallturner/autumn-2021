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

    /**
     * операция break требуется для того, чтобы при нормальной работе метода не доходило дело до исключения, тк
     * при последней работе цикла while исключение бросится в любом случае.
     * @param meaning - значение элемента
     * @throws InvalidListValueExсeption выбрасывается если нет элемента с введенным в параметр значением
     */
    @Override
    public void getPosition(int meaning) throws InvalidListValueExсeption {
        MyLinkedList start2 = start;
        int x = 0;
        while (start2 != null) {
            if (start2.meaning == meaning) {
                System.out.println(x);
                break;
            }
            start2 = start2.link;
            x++;
            if (start2 == null) {
                throw new InvalidListValueExсeption("элемента с таким значением в списке нет");
            }
        }
    }

    /**
     * операция break требуется для того, чтобы при нормальной работе метода не доходило дело до исключения, тк
     * при последней работе цикла while исключение бросится в любом случае.
     *
     * @param position - номер элемента
     * @throws IndexOutOfBoundsException выбрасывается если выходим за пределы списка или позиция <0
     */
    @Override
    public void getMeaning(int position) throws IndexOutOfBoundsException {
        MyLinkedList start3 = start;
        int x = 0;
        while (start3 != null) {
            if (x == position) {
                System.out.println(start3.meaning);
                break;
            }
            start3 = start3.link;
            x++;
            if (position < 0 || start3 == null) {
                throw new IndexOutOfBoundsException("Вы ввели отрицательный индекс или вышли за пределы списка");
            }
        }
    }
}



