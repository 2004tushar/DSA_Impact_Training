package Day_13_DSA_Impact;
import java.util.Scanner;
public class WordSearch {
    public boolean canBeIncreasing(int[] nums) {
        //Write your code here
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length - 1; i++){
            if (nums[max] > nums[i + 1] ){
                count++;
            }
        }
        return count < 1;
    }

    //Do not edit this part of code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        WordSearch word = new WordSearch();
        boolean result = word.canBeIncreasing(nums);
        System.out.println(result ? "true" : "false");
    } 
}