public class Insertionsort2 {
    public static void print(List<Integer> arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        int par = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j >= 1 && arr.get(j) < arr.get(j-1); j--) {
                int temp = arr.get(j);
                arr.set(j,arr.get(j-1));
                arr.set(j-1,temp);
            }
            print(arr);
        }
    }

}
