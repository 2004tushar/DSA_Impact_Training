package Day_5_DSA_Impact.Array;

public class Student {
    String name;
    int roll_no;
    public Student(){}
    public Student(String name, int roll_no) {
        this.name = name ;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
}
