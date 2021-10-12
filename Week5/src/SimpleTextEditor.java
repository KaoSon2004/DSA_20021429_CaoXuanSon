import java.io.*;
import java.util.*;

public class SimpleTextEditor {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        Stack <String> stk = new Stack<String>();
        String s = "";
        stk.push(s);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                String str = sc.next();
                s = s + str;
                stk.push(s);
            }
            else if (a == 2) {
                int b = sc.nextInt();
                s = s.substring(0,s.length()-b);
                stk.push(s);
            }
            else if (a == 3) {
                int b = sc.nextInt();
                System.out.println(s.charAt(b-1));
            }
            else {
                s = stk.pop();
                s = stk.peek();
            }
        }
    }
}
}