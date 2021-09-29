import edu.princeton.cs.algs4.*;
public class twoSum {
    public static void main(String[] args) {
        In in = new In("D:\\DATA\\algs4-data\\algs4-data\\4Kints.txt");
        int[] a = in.readAllInts();
        for (int i=0;i< a.length-1;i++) {
            for (int j=i+1;j<a.length;j++) {
                if (a[i]+a[j]==0)
                    StdOut.printf("%d %d\n",a[i],a[j]);
            }
        }
}
}
