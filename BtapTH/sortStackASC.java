
import java.util.Scanner;
import java.util.Stack;

public class sortStackASC {
    public static Stack sort(Stack<Integer> stk1) {
        Stack<Integer> stk2 = new Stack<>();

        while(!stk1.isEmpty()) {
            int k = stk1.pop();
            while(!stk2.isEmpty() && stk2.peek() < k) {
                stk1.push(stk2.pop());
            }
            stk2.push(k);
        }
        return stk2;

    }

    public static void print(Stack<Integer> stk1) {
        while(!stk1.isEmpty()) {
            System.out.print(stk1.pop() + " " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk1 = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            stk1.push(a);
        }
        print(sort(stk1));
    }
}
