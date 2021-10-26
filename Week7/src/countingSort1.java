import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class countingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ans.add(0);
        }
        for (int i = 0; i < 100; i++) {
            ans.set(arr.get(i), (ans.get(arr.get(i)) + 1));
        }
        return ans;

    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr.add(a);
        }

        List<Integer> ans = countingSort(arr);
        //System.out.println(ma);
        for (int i : ans) {
            System.out.print(i + " ");
       }
    }
}
