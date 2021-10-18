import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort1 {
    public static void print (List<Integer> arr) {

        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int par = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {

            if (arr.get(i) > par) {
                arr.set(i+1,arr.get(i));
                print(arr);
            }
            else if (arr.get(i) < par) {
                arr.set(i+1,par);
                print(arr);
                break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr.add(a);

        }
        insertionSort1(n,arr);
        print(arr);
    }
}
