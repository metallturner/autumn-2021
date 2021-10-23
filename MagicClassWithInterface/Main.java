import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите n и e");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int e = scanner.nextInt();
            Value value = new Value(n, e);

            if (n >= 0 && e >= 0) {
                System.out.println("модуль числа " + n + " = " + value.calcAbs());
                System.out.println("факториал числа " + n + " = " + value.calcFact());
                System.out.println("число " + n + " в степени " + e + " = " + value.calcPow());
            } else {
                System.out.println("факториал числа" + " " + n + "=" + value.calcFact());
                System.out.println("модуль числа" + " " + n + "=" + value.calcAbs());
                System.out.println("подсчет степени невозможен(на самом деле возможен..), так как числа n или e меньше 0");
            }
        }
        else {
            System.out.println("введите целое число");
    }
        }
        }

