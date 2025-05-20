package Day_6_DSA_Impact;

public class Target_SumOfElement {
    public int[] targetSum(int[] arr, int target){
        int[] index = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length -1; j >= i  ; j--) {
                if(target == arr[i] + arr[j]){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        System.out.print(index);;
        return index;
    }
    public static void main(String[] args) {
        Target_SumOfElement obj = new Target_SumOfElement();
        int[] arr = {3,3};
        int target = 6;
    }
}

