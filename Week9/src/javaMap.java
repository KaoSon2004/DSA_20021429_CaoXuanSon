//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class javaMap{
    public static void main(String []argh)
    {
        Map<String,Integer> people = new HashMap();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            people.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (people.containsKey(s)) {
                System.out.println(s + "=" + people.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}
