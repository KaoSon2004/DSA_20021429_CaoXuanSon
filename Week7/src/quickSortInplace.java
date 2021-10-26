import java.io.*;
import java.util.*;

public class quickSortInplace {
    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public static void print(List<Integer> arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int quickSort(List<Integer> arr,int lo,int hi) {
        int pi = arr.get(hi);
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if(arr.get(j) <= pi) {
                swap(arr,i,j);
                i = i +1;
            }
        }
        swap(arr,i,hi);
        print(arr);
        return i;
    }
    public static void sort (List<Integer> arr,int lo, int hi) {
        if (lo >= 0 && hi >= 0 && lo < hi) {
            int j = quickSort(arr,lo,hi);
            sort(arr,lo,j-1);
            sort(arr,j+1,hi);
        }

    }
    public static void sort(List<Integer> arr) {
        sort(arr,0,arr.size() - 1);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }
        sort(list);

    }
}