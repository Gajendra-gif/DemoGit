public class CountPosNeg {
    public static void main(String[] args) {
        int[] arr = {3, -1, 0, 8, -5, 6, 0, -2, 7, 4};
//1. Count Positive, Negative, and Zer
        int pos =0;
        int neg =0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                pos++;
            else if (arr[i] < 0)
                neg++;
            else
                zero++;
        }
        System.out.println("Postive elments are :"+pos);
        System.out.println("Ngative elments are :"+neg);
        System.out.println("Zero elments are :"+zero);

        //2. Count Even and Odd Elements

        int[] arr2 = { 0, 8, 6, 0, -2, 4 ,3, -1, -5, 7};

        int even =0 , odd =0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2==0){
                even++;
            }
            else
                odd++;
        }

        System.out.println("even elments are :"+even);

        System.out.println("odd elments are :"+odd);

        //3. Index of Maximum Element
        int index = 0 , index2 = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
                index =i;
            }
            if (min > arr[i]){
                min = arr[i];
                index2 = i;
            }
        }
        System.out.println("Index of Max element "+index +" max element "+ max);
        System.out.println("Index of min Element "+index2 + " min elemet "+ min);

        //4. Index of Minimum Element
        //5)Print Elements Greater Than k (k = 3)

        int k = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k)
                System.out.println(arr[i]);
        }
        System.out.println(30-29+1);
    }
}
