import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {
    private class Node {
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    public void Enqueue(int data) {
        if (head == null) {
            head = new Node();
            head.data = data;
            head.next = null;
            tail = head;
        }
        else {
            Node newLast = new Node();
            newLast.data = data;
            newLast.next = null;
            tail.next = newLast;
            tail = newLast;
        }
    }
    public int Dequeue() {
        int ans = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return ans;
    }
    public void print() {
        System.out.println(head.data);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        QueueUsingTwoStacks ans = new QueueUsingTwoStacks();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                int b = sc.nextInt();
                ans.Enqueue(b);
            }
            if (a == 2) {
                ans.Dequeue();
            }
            if (a == 3) {
                ans.print();
            }
        }
    }
}