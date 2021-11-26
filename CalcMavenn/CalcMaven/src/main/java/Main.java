public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10,5);
        System.out.println(calc.add());
        System.out.println(calc.div());
        System.out.println(calc.mult());
        System.out.println(calc.sub());
    }
}
