public class SelectionSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int miIndx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[miIndx]) miIndx = j;
            }
            int temp = arr[miIndx];
            arr[miIndx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort test = new SelectionSort();
        int arr[] = {10,4,12,41,39,90};
        test.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
