import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore fork = new Semaphore(1);
        Philosopher philosopher = new Philosopher("Аристотель");
        Philosopher philosopher1 = new Philosopher("Сократ");
        Philosopher philosopher2 = new Philosopher("Демокрит");
        Philosopher philosopher3 = new Philosopher("Платон");
        Philosopher philosopher4 = new Philosopher("Декарт");

        philosopher.fork = fork;
        philosopher1.fork = fork;
        philosopher2.fork = fork;
        philosopher3.fork = fork;
        philosopher4.fork = fork;

        philosopher.start();
        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
    }
}
class Philosopher extends Thread{
    String name;

    public Philosopher(String name) {
        this.name = name;
    }
    Semaphore fork;
    @Override
    public void run(){
        System.out.println(this.getName() + " Сижу думаю что бы такого умного сморозить");
        try {
            fork.acquire();
            System.out.println(this.getName() + "Получил вилку, сижу ем");
            Thread.sleep(5000);
            System.out.println(this.getName() + "Пора отдавать вилку, надо дальше думать");
            fork.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
