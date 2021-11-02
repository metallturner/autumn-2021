public class Main {
    public static void main(String[] args) {
        Ferma <? extends Ferma> ferma = new Ferma<>();
        Ferma someKindOfFruit = ferma.getValue();
        Pickup <Ferma> pickup = new Pickup<>();
        Mall <? super Ferma> mall = new Mall();
      System.out.println(mall.buyFruit(pickup, "apple"));
        System.out.println(mall.buyFruit(pickup, "pinapple"));

    }
}
