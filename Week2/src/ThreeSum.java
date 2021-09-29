import edu.princeton.cs.algs4.*;
import java.util.Arrays;
public class ThreeSum {
    public static int binarySearch(int[] a,int s,int e,int x) {
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
    public static void main(String[] args) {
        In in = new In("D:\\DATA\\algs4-data\\algs4-data\\4Kints.txt");
        int[] a = in.readAllInts();
        Arrays.sort (a);
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int z= Integer.MAX_VALUE;
        for (int i=0;i<a.length-1;i++)
        {
            if (a[i]!=x)
                for (int j=i+1;j<a.length;j++)
                {
                    if (a[j]!=y||(-a[i]-a[j])!=z)
                        if (binarySearch(a,0,a.length-1,-a[i]-a[j])!=-1)
                        {
                            x = a[i];
                            y = a[j];
                            z = -a[i] -a[j];
                            StdOut.printf("%d %d %d\n",a[i],a[j],-a[i]-a[j]);
                        }
                }
        }

    }
}
