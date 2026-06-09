package Arrays;
import java.util.HashMap;

public class MissingRepeating {

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 4, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each element
        for(int i = 0; i < arr.length; i++) {

            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        int missing = -1;
        int repeating = -1;

        // Find missing and repeating number
        for(int i = 1; i <= arr.length; i++) {

            if(!map.containsKey(i)) {
                missing = i;
            }

            if(map.containsKey(i) && map.get(i) > 1) {
                repeating = i;
            }
        }

        System.out.println("Repeating Number = " + repeating);
        System.out.println("Missing Number = " + missing);
    }
}
