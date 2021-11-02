import edu.princeton.cs.algs4.In;

import static java.util.Arrays.sort;

public class HashTable {


    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        int i = 1;
        while (i < a.length) {
            int count = 1;
            while (a[i-1].equals(a[i])) {
                count++;
                i = i +1;
            }
            System.out.println(a[i-1] + count);
            i++;
        }
    }


}
