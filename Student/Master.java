public class Master extends Student{
    String directionOnBachelor;

    public Master(String name) {
        super(name);
    }

    public Master(String name, String directionOfStudy, String directionOnBachelor, long number) {
        super(name, directionOfStudy, number);
        this.directionOnBachelor = directionOnBachelor;
    }
}

