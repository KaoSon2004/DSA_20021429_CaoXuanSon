import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hash1 = new HashSet<>();
        HashSet<Integer> hash2 = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            hash1.add(arr.get(i));
        }

        for (int i = 0; i <brr.size(); i++) {
            hash2.add(brr.get(i));
        }
        for(int i : hash2) {
            if(Collections.frequency(arr, i) != Collections.frequency(brr, i)) {
                ans.add(i);
            }
        }
        return ans;

    }

    public static List<Integer> missingNumbers1(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        Collections.sort(arr);
        Collections.sort(brr);
        List<Integer> ans = new ArrayList<>();
        int j = 0;
        for (int i = 0; i <brr.size(); i++) {
            if (brr.get(i) ==  arr.get(j)) {
                j++;
            }
            else {
                ans.add(brr.get(i));
            }
        }
        Collections.sort(ans);
        return ans;

    }
    public static List<Integer> missingNumbers2(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            temp.add(0);
        }
        for (int i = 0; i < brr.size(); i++) {
            temp.set(brr.get(i),temp.get(brr.get(i)) + 1 );
        }
        for (int i = 0; i < arr.size(); i++) {
            temp.set(arr.get(i),temp.get(arr.get(i)) - 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) > 0) {
                ans.add(i);
            }
        }
        return  ans;
    }
    public static void main(String[] args) {

    }
}
