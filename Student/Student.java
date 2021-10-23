public class Student {
    long number;
    String name;
    String directionOfStudy;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String directionOfStudy, long number) {
        this.name = name;
        this.directionOfStudy = directionOfStudy;
        this.number = number;
    }
}
