/**
 * врятли мы успеем ввести команды restart и stop в одну строку пока работает таймер, поэтому назначим команде restart
 * строку R, команде stop строку B.
 *
 * Создаем коллекцию Map, в которой у нас будет только один поток. Это сделано для того, чтобы мы могли сколько угодно
 * раз делать рестарт. В рестарте мы создаем новый поток, при этом старый поток выключаем, и кладем в коллекцию еще один
 * поток с таким же ключем. Так как в мапе у нас не может быть дубликатов ключей, новый поток создается на месте старого,
 * который завершил свою работу. Чтобы программа не отвалилась при первоначальном вводе рестарт(коллекция пустая), добавляем проверку
 * в рестарт на пустую коллекцию, и если она пустая, то создаем новый поток и закидываем в нее.
 * Также добавляем проверку на пустую коллекцию если первоначально b.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Timer {

    public static void main(String[] args) {
        Map<Integer, Thread> threadList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String start = scanner.nextLine();
            if (start.equals("start") || start.equals("r") || start.equals("b")) {
                Integer i = 0;
                if (start.equals("start")) {
                    threadList.put(i, new Thread(new MyThread()));
                    threadList.get(i).start();

                } else if (start.equals("r")) {
                    if (threadList.isEmpty()) {
                        threadList.put(i, new Thread(new MyThread()));
                        threadList.get(i).start();
                    }
                    threadList.get(i).interrupt();
                    threadList.put(i, new Thread(new MyThread()));
                    threadList.get(i).start();

                } else if (start.equals("b")) {
                    if (threadList.isEmpty()) {
                        break;
                    } else if (threadList.get(i).isAlive()) {
                        threadList.get(i).interrupt();
                        // System.out.println(threadList);
                    }
                    break;
                }
            } else break;
        }
    }
}


class MyThread implements Runnable {
    @Override
    public void run() {
        int i = 0;
        Thread current = Thread.currentThread();
        while (!current.isInterrupted()) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (Exception e) {
                break;
            }
            i++;

        }
    }
}







