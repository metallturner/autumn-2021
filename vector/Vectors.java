package com.vector;

import java.util.ArrayList;


public class Vectors implements VectorsInterface {
    double x;
    double y;
    double z;

    Vectors(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public double calculateVectorLength() {        //метод для определения длины вектора
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);

    }
    @Override
    public double calculateVectorScalarMult(Vectors vector2) {  // метод для скалярного произведения
        return (this.x * vector2.x) + (this.y * vector2.y) + (this.z * vector2.z);
        // новый вектор не возвращаем, тк скалярное произведение - это число
    }
    @Override
    public Vectors calculateVectorMult(Vectors vector2) { // метод для векторного произведения
        double x, y, z;
        x = this.y * vector2.z - this.z * vector2.y;
        y = this.z * vector2.x - this.x * vector2.z;
        z = this.x * vector2.y - this.y * vector2.x;

        return new Vectors(x, y, z);    // возвращаем новый вектор
    }

    public static String angleOfVectors(Vectors vector1, Vectors vector2) { // метод для cos угла между векторами
        return "cosAngle" + " = " + (vector1.calculateVectorScalarMult(vector2) /
                ((Math.abs(vector1.calculateVectorLength()) * vector2.calculateVectorLength())));
    }
    @Override
    public Vectors calculateSumVectors(Vectors vector2) {  // метод для суммы векторов
        double x, y, z;
        x = this.x + vector2.x;
        y = this.y + vector2.y;
        z = this.z + vector2.z;
        return new Vectors(x, y, z);  // сумма векторов - новый вектор
    }
    @Override
    public Vectors calculateDiffVectors(Vectors vector2) { // метод для разности векторов
        double x, y, z;
        x = this.x - vector2.x;
        y = this.y - vector2.y;
        z = this.z - vector2.z;
        return new Vectors(x, y, z);  // разность векторов - новый вектор

    }

    public static ArrayList<Vectors> listArr(int n) {    // метод для заполнения списка новыми векторами
        ArrayList<Vectors> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Vectors(Math.ceil(Math.random() * 100), Math.ceil(Math.random() * 100), Math.ceil(Math.random() * 100)));
        }
        return list;
    }

}








