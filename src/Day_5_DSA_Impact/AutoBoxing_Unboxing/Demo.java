package Day_5_DSA_Impact.AutoBoxing_Unboxing;

public class Demo {
    public static void main(String[] args) {
        //    Integer num = new Integer(10); // not in use and deprecated
        Integer num = 30; // After java 5 => Autoboxing
        int a = num; // Auto - Unboxing

    /* Type casting => Two type
      1) implicit -> process of converting values from lower datatype to higher datatype done by java internally
      2)Explicit -> process of converting values from higher datatype to lower datatype done by programer
    */
        // 1. Implicit Example
//        byte b = 20;
//        int i = b;
//        System.out.println(i);

        // 2. Explicit Example
//        int c = 128;
//        byte b = (byte) c;
//        System.out.println(b);
    }
}