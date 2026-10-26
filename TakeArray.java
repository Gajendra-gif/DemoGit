// 1)Input n and take n integers into an array; print them.
import java.util.Arrays;
import java.util.Scanner;

public class TakeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number elements :");
        int n = sc.nextInt();
        System.out.println("Enter array elements :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //2)Find the sum of all elements in an array.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of Array is:" + sum);

        //3)Find the average of array elements.

        int avg = sum / n;
        System.out.println("Average of Array Elements : "+ avg);

        //4)Find the maximum element in an array.


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum is "+ max);


    }
}
