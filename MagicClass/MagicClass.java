import java.util.Scanner;

public class MagicClass {
    public static void main(String[] args) {
        System.out.println("введите n и e");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int e = scanner.nextInt();
            if (n >= 0 && e >= 0) {
                System.out.println("факториал числа" + " " + n + "=" + calculateFact(n));
                System.out.println("модуль числа" + " " + n + "=" + calculateAbs(n));
                System.out.println(n + " " + "в степени" + " " + e + "=" + calculatePow(n, e));
            } else {
                System.out.println("факториал числа" + " " + n + "=" + calculateFact(n));
                System.out.println("модуль числа" + " " + n + "=" + calculateAbs(n));
                System.out.println("подсчет степени невозможен, так как числа n или e меньше 0");
            }
        } else
            System.out.println("введите целое число");
    }

    public static int calculateFact(int n) {
        /*
        // вариант с рекурсией
        if (n <= 1) {
           return 1;
        } else
            return n * calculateFact(n - 1);
             */

        int res = 1;
        for (int i = 1; i <= Math.abs(n); i++) {
            if (n < 0) {
                res = res * -i;
            } else
                res = res * i;
        }
        return res;
    }


    public static int calculateAbs(int n) {
        return Math.abs(n);
    }

    public static int calculatePow(int n, int e) {
        return (int) Math.pow(n, e);
    }
}