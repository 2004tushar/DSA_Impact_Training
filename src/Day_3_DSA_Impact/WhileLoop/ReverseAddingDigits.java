package Day_3_DSA_Impact.WhileLoop;

public class ReverseAddingDigits {
    public static void main(String[] args) {
        int num = 62481;
        int RevNum = 0;
        while (num > 0){
            int digit = num%10;
            RevNum = RevNum*10 + digit;
            num/=10;
        }
        System.out.println("Reverse Order of Num Variable is : " + RevNum);
    }
}