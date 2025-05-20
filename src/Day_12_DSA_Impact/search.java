package Day_12_DSA_Impact;

public class search {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30, 40, 50};
        int target = 60;
        int index = 0;
        int ans = Search(arr, target, index);
        System.out.println(ans);
    }
    
    public static int Search(int[] arr, int target, int i){
        if(i == arr.length){
            return -1;
        }
        if (arr[i] == target){
            return i;
        }
        return Search(arr, target, i + 1);
    }
}
