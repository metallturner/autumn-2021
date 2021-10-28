public class Main {
    public static void main(String[] args)  {
        Triangle triangle = new Triangle(3,4,6);
        try {
            System.out.println(triangle.getInscribedCircleRadius());
        } catch (NonExistentTriangle e) {
            System.out.println("треугольник не может быть построен");
        }
    }

}
