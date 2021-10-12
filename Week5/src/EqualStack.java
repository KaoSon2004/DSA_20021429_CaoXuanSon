import java.util.List;
import java.util.Stack;

public class EqualStack {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        Stack <Integer> stk1 = new Stack();
        stk1.push(h1.get(h1.size()-1));
        Stack <Integer> stk2 = new Stack();
        stk2.push(h2.get(h2.size()-1));
        Stack <Integer> stk3 = new Stack();
        stk3.push(h3.get(h3.size()-1));
        for (int i = h1.size() - 2; i >= 0; i--) {
            stk1.push(h1.get(i) + stk1.peek());
        }
        for (int i = h2.size() - 1; i >= 0; i--) {
            stk2.push(h2.get(i) + stk2.peek());
        }
        for (int i = h3.size() -1; i >= 0; i--) {
            stk3.push(h3.get(i)+stk3.peek());
        }
        while (!stk1.isEmpty() && !stk2.isEmpty() && !stk3.isEmpty() ) {
            if (stk1.peek() == stk2.peek() && stk1.peek() == stk3.peek()) {
                return stk1.peek();
            }
            if (stk1.peek() > stk2.peek() && stk1.peek() > stk3.peek()) {
                stk1.pop();
            }
            else if (stk2.peek() > stk1.peek() && stk2.peek() > stk3.peek()) {
                stk2.pop();
            }
            else if (stk3.peek() > stk1.peek() && stk3.peek() > stk2.peek()) {
                stk3.pop();
            }
        }
        return -1;
    }
}
