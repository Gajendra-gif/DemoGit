import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,4,5,5};
        // First method

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x:arr){
            set.add(x);
        }

        System.out.println(set);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
