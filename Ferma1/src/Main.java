import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
List <Fruits> pineapplesBox = new ArrayList<>();   // место на ферме, где выращивают ананасы
List <Vegetables> cucumbersBox = new ArrayList<>(); // место на ферме, где выращивают огурцы
pineapplesBox.add(new Pineapple("Ананас"));
cucumbersBox.add(new Cucumber("Огурец"));


        Ferma <Fruits> ferma = new Ferma<>(); // если нужно выращивать овощи, то Fruits меняем на Vegetables
        ferma.setValue(pineapplesBox.get(0));   //выращиваем на ферме фрукт, либо если ферма овощная, то овощ

        Pickup <Ferma> pickup = new Pickup<>(); // принимает все что выращивают на ферме
        pickup.setValue(ferma.getValue());  // закидываем то что вырастили на ферме

        Mall <? super Ferma> mall = new Mall<>();
        mall.setValue(pickup.getValue());  // закидываем то, что привез грузовик, магазин может принимать все что вырастили на ферме

        mall.buy(pickup);
    }


}





