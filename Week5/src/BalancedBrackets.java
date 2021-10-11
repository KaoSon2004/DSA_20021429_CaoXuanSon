import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static class Stack<Item> {
        private class Node {
            Item item;
            Node next;
        }
        Node head;
        public void push(Item item) {
            if (head == null) {
                head = new Node();
                head.item = item;
                head.next = null;
            }
            else {
                Node temp = new Node();
                temp.item = item;
                temp.next = head;
                head = temp;
            }
        }
        public Item pop() {
            Item temp = head.item;
            head = head.next;
            return temp;
        }
        public Item data() {
            return head.item;
        }
        public boolean isEmpty() {
            return head == null;
        }
    }
    public static String isBalanced(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' ||s.charAt(i) == '[') {
                stk.push(s.charAt(i));
            }
            else {
                char temp = stk.pop();
                if (temp == '(' && s.charAt(i) != ')')
                    return "NO";
                if (temp == '{' && s.charAt(i) != '}')
                    return "NO";
                if (temp == '[' && s.charAt(i) != ']')
                    return "NO";
            }
        }
        if (stk.isEmpty()){
            return "YES";
        }
        return "NO";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isBalanced(s));

    }
}
