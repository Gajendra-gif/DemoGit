import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]){
                System.out.println("element found :"+k +" at index "+i);
            }
        }
        //Reverse array
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }
        //sorted
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] > arr[i+1]){
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");


    }
}
