package Day_5_DSA_Impact.Array;

public class StudentArrayDemo {
    public static void main(String[] args) {
        // Class name var_name = new class name();

        Student std1 = new Student("Manish",54);
        Student std2 = new Student("Ankit",35);
//        std1.name = "Tushar";
//        std1.roll_no = 42;
//        System.out.println(std1.name);
//        System.out.println(std1.roll_no);

        Student[] batch44 = new Student[5];
        batch44[0] = std1;
        batch44[1] = std2;

        System.out.println(batch44[0]);
    }
}
