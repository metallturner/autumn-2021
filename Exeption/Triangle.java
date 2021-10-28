public class Triangle implements TriangleInter {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getInscribedCircleRadius() throws NonExistentTriangle {
        boolean b = ((this.a + this.b) <= this.c || (this.c + this.b) <= this.a || (this.a + this.c) <= this.b);
        if (b){
            throw new NonExistentTriangle("треугольник не может существовать");
        }
        else {
            double p = (double) (this.a + this.b + this.c) / 2;
            return Math.sqrt(((p - this.a) * (p - this.b) * (p - this.c)) / p);
        }

    }
}
