package com.vector;

import java.util.ArrayList;


public class VectorInfo {
    double x;
    double y;
    double z;

    VectorInfo(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    protected static double vectorLength(VectorInfo vector1) {        //метод для определения длины вектора
        return Math.sqrt(vector1.x * vector1.x + vector1.y * vector1.y + vector1.z * vector1.z);

    }

    protected static double scalarMult(VectorInfo vector1, VectorInfo vector2) {  // метод для скалярного произведения
        return (vector1.x * vector2.x) + (vector1.y * vector2.y) + (vector1.z * vector2.z);
        // новый вектор не возвращаем, тк скалярное произведение - это число
    }

    protected static VectorInfo vectorMult(VectorInfo vector1, VectorInfo vector2) { // метод для векторного произведения
        double x$, y$, z$;
        x$ = vector1.y * vector2.z - vector1.z * vector2.y;
        y$ = vector1.z * vector2.x - vector1.x * vector2.z;
        z$ = vector1.x * vector2.y - vector1.y * vector2.x;

        return new VectorInfo(x$, y$, z$);                                            // возвращаем новый вектор
    }

    protected static String angleOfVectors(VectorInfo vector1, VectorInfo vector2) { // метод для cos угла между векторами
        return "cosAngle" + " = " + (scalarMult(vector1, vector2) / ((Math.abs(vectorLength(vector1)) * vectorLength(vector2))));
    }

    protected static VectorInfo sumVectors(VectorInfo vector1, VectorInfo vector2) {  // метод для суммы векторов
        double x$, y$, z$;
        x$ = vector1.x + vector2.x;
        y$ = vector1.y + vector2.y;
        z$ = vector1.z + vector2.z;
        return new VectorInfo(x$, y$, z$);  // сумма векторов - новый вектор
    }

   protected static VectorInfo diffVectors(VectorInfo vector1, VectorInfo vector2) { // метод для разности векторов
        double x$, y$, z$;
        x$ = vector1.x - vector2.x;
        y$ = vector1.y - vector2.y;
        z$ = vector1.z - vector2.z;
        return new VectorInfo(x$, y$, z$);  // разность векторов - новый вектор

    }

    protected static ArrayList<VectorInfo> listArr(int n) {    // метод для заполнения списка новыми векторами
        ArrayList<VectorInfo> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new VectorInfo(Math.ceil(Math.random() * 100), Math.ceil(Math.random() * 100), Math.ceil(Math.random() * 100)));
        }
        return list;
    }
}








