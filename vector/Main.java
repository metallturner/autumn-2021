package com.vector;
import java.util.ArrayList;
import java.util.Scanner;
import static com.vector.Vectors.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите N");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Vectors vector1 = new Vectors(3, 4, 5);
        Vectors vector2 = new Vectors(5, 4, 3);

        System.out.println("длина vector1 = "+vector1.calculateVectorLength());
        System.out.println("скалярное произведение  vector1 и vector2 = " + vector1.calculateVectorScalarMult(vector2));
        System.out.println
                ("векторное произведение  vector1 и vector2 = " + vectorToString(vector1.calculateVectorMult(vector2)));
        System.out.println(angleOfVectors(vector1, vector2));
        System.out.println("сумма vector1 и vector2 = " + vectorToString(vector1.calculateSumVectors(vector2)));
        System.out.println("разность vector1 и vector2 = " + vectorToString(vector1.calculateDiffVectors(vector2)));
        System.out.println("координаты векторов случайной длины:");
        convertList(listArr(n), n);

    }


    public static String vectorToString(Vectors vector) {  // метод для вывода координат в виде строки.
        return vector.x + ", " + vector.y + ", " + vector.z;
    }


    public static void convertList(ArrayList<Vectors> list, int n) { //выводим список в виде строки
        for (int i = 0; i < n; i++) {
            System.out.println(vectorToString(list.get(i)));
        }
    }
}
