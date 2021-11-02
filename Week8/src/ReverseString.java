import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int count=0;
        /* Enter your code here. Print output to STDOUT. */
        for (int i=0;i<A.length()/2;i++)
        {
            if (A.charAt(i)==A.charAt(A.length()-1-i))
                count++;

        }
        if (count==A.length()/2)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();

    }
}
