package Day_6_DSA_Impact;

import javax.sound.midi.Soundbank;

public class Min_MaxElement {
    public static void main(String[] args) {
        int [] arr = {10,20,30,2,45,5};
        int min = 0;
        int max = 0;
        // find Min element
        for (int i = 0; i < arr.length; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        System.out.println("Min element: " + arr[min] + "\nMax Element: " + arr[max]);
        System.out.println("Min element Index: " + min + "\nMax Element Index: " + max);
    }
}
