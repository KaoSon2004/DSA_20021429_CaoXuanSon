public class BinarySearch {
    public static int binarySearch(int[] a, int s, int e, int x) {

        if (e>=s) {
            int mid = s + (e - s) / 2;
            if (a[mid] == x)
                return mid;
            else if (a[mid] > x)
                return binarySearch(a, s, mid - 1, x);
            return binarySearch(a,mid + 1, e, x);
        }
        return -1;
    }
}
