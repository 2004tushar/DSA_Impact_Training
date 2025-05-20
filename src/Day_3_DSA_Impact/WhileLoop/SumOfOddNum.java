package Day_3_DSA_Impact.WhileLoop;

public class SumOfOddNum {
    public static void main(String[] args) {
        int num = 123456;
        int EvenSum = 0;
        int OddSum = 0;
        while(num>0){
            int digit = num%10;
            if (digit % 2==0) {
                EvenSum+=digit;
            }else {
                OddSum+=digit;
            }
            num/=10;
        }
        System.out.println("Sum of Even Digits: " + EvenSum);
        System.out.println("Sum of Odd Digits: " + OddSum);
    }
}