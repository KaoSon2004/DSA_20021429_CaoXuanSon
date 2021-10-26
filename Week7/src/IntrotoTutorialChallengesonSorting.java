import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntrotoTutorialChallengesonSorting {
    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (arr.get(mid) == V) {
                return mid;
            }
            else if (arr.get(mid) > V) {

                r = mid - 1;
            }
            else if (arr.get(mid) < V) {
                l = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
        System.out.println(introTutorial(4,arr));
    }
}
