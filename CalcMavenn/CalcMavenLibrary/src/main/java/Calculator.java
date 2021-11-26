public class Calculator {
    int x;
    int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int add(){
        return this.x+this.y;
    }
    public int sub(){
        return this.x-this.y;
    }
    public int div(){
        return this.x/this.y;
    }
    public int mult(){
        return this.x*this.y;
    }
}
