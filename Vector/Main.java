package com.vector;

import java.util.ArrayList;
import java.util.Scanner;

import static com.vector.VectorInfo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите N");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        VectorInfo vector1 = new VectorInfo(3, 4, 5);
        VectorInfo vector2 = new VectorInfo(5, 4, 3);

        System.out.println("длина vector1 = "+vectorLength(vector1));
        System.out.println("скалярное произведение  vector1 и vector2 = " + scalarMult(vector1, vector2));
        System.out.println("векторное произведение  vector1 и vector2 = " + vectorToString(vectorMult(vector1, vector2)));
        System.out.println(angleOfVectors(vector1, vector2));
        System.out.println("сумма vector1 и vector2 = " + vectorToString(sumVectors(vector1, vector2)));
        System.out.println("разность vector1 и vector2 = " + vectorToString(diffVectors(vector1, vector2)));
        System.out.println("координаты векторов случайной длины:");
        convertList(listArr(n), n);

    }


    protected static String vectorToString(VectorInfo vectorNew) {  // метод для вывода координат в виде строки.
        return vectorNew.x + ", " + vectorNew.y + ", " + vectorNew.z;
    }


    protected static void convertList(ArrayList<VectorInfo> list, int n) { //выводим список в виде строки
        for (int i = 0; i < n; i++) {
            System.out.println(vectorToString(list.get(i)));
        }
    }
}
