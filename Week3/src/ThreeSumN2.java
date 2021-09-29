import java.util.ArrayList;
import java.util.List;

public class ThreeSumN2 {
    public static void find (int arr[]) {
        List<Integer> list1 =new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++ ) {
            for (int j = i + 1; j < arr.length; j++) {
                if (list1.contains(-arr[i]-arr[j])) {
                    System.out.printf("%d %d %d\n",arr[i],arr[j],-arr[i]-arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        find(arr);
    }
}
