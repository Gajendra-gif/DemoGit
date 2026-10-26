public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,10,5};

        //second way

        if (arr.length < 2){
            System.out.println("No second largest element is available");
           return;
        }

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                second = max;
                max = arr[i];
            }
            else if (second < arr[i] && arr[i] != max)
                    second = arr[i];

        }
        if (second == Integer.MIN_VALUE)
            System.out.println("No second largest element is available");
        else
           System.out.println(max + " "+ second);
    }
}
/*first method
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (second < arr[i] && arr[i] != max)
                second = arr[i];
        }
        System.out.println("second max is "+second);*/