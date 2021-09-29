import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.abs;

public class ClosetNumber {

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        List <Integer> ans= new ArrayList<>();
        int mi = Integer.MIN_VALUE;
        Collections.sort(arr);
        for (int i = 1; i < arr.size(); i++ ) {
            if ((arr.get(i) - arr.get(i-1)) < mi) {
                mi = arr.get(i) - arr.get(i-1);
            }
        }
        for (int i : arr) {
            if (arr.contains(i+mi)) {
                ans.add(i);
                ans.add(i+mi);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List <Integer> ans= new ArrayList<>(Arrays.asList(-20, -3916237, -357920,
                -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854));
        System.out.println(closestNumbers(ans));
        //System.out.println(Min(ans));
    }
}
