import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class closetNumber {
    private static List<Integer> aux;
    public static void sort(List<Integer> arr) {
        aux = new ArrayList<>();
        for (int i = 0; i < arr.size();i ++) {
            aux.add(0);
        }
        sort(arr,0,arr.size() - 1);
    }
    public static void sort(List<Integer> arr, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(arr,lo,mid);
        sort(arr,mid+1,hi);
        merge(arr,lo,mid,hi);
    }
    public static void merge(List<Integer> arr, int lo,int mid,int hi) {
        int i = lo;
        int j = mid+1;
        for (int k = lo; k <= hi; k++) {
            aux.set(k,arr.get(k));
        }
        for (int k = lo;k <=hi; k++) {
            if (i > mid) arr.set(k,aux.get(j++));
            else if (j > hi) arr.set(k,aux.get(i++));
            else if (aux.get(j) < aux.get(i)) arr.set(k,aux.get(j++));
            else arr.set(k,aux.get(i++));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i ++) {
            int a = sc.nextInt();
            arr.add(a);
        }
        sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
