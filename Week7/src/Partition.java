import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partition {
    public static void exch(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        int par = arr.get(0);
        int i  = 1;
        int j = arr.size() - 1;
        while (true) {
             while (arr.get(i) < par) {
                 i = i + 1;
                 if (i == (arr.size() -1)) break;
             }
             while (arr.get(j) > par) {
                 j = j - 1;
                 if (j == 0) break;
             }
             if (i >= j) {
                 break;
             }
             exch(arr,i,j);
        }
        exch(arr,0,j);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
        //exch(arr,1,4);
        List<Integer> ans = new ArrayList<>();
        ans = quickSort(arr);
        for (int i : ans) {
            System.out.println(i + " ");
        }
    }
}
