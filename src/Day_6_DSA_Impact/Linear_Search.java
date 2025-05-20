package Day_6_DSA_Impact;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 60;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (target == arr[i]){
                index = i;
            }

        }
        if (arr[index] != target){
            System.out.println(-1);
        }else {
            System.out.println(index);
        }
    }
}