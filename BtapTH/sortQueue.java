
import java.util.Scanner;

public class sortQueue {
        private static int sortIn;
        public static int minIndex(Queuee<Integer> que1) {
            int mi = Integer.MAX_VALUE;
            int ans = -1;
            int n = que1.size();
            for (int i = 0; i < n; i++ ) {
                int current = que1.pop();
                if (current  < mi && i < sortIn) {
                    mi = current;
                    ans = i;
                }
                que1.push(current);
            }
            return ans;
        }
        public static void insertToTail(Queuee<Integer> que1) {
            int temp = 0;
            int n =que1.size();
            int a = minIndex(que1);
            for (int i = 0; i < n; i++) {
                if (i != a) {
                    int current = que1.pop();
                    que1.push(current);
                }
                else {
                    temp = que1.pop();
                }
            }
            que1.push(temp);
            sortIn--;
        }
        public static void print(Queuee<Integer> que1) {
            int n = que1.size();
            for (int i = 0; i < n; i++) {
                int current = que1.pop();
                System.out.print(current + " ");
                que1.push(current);
            }
            System.out.println();
        }
        public static void sort(Queuee <Integer> que1) {
            while (sortIn != 0) {
                insertToTail(que1);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Queuee <Integer> que1 = new Queuee<Integer>();
            int n = sc.nextInt();
            sortIn = n;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                que1.push(a);
            }
            System.out.println(minIndex(que1));
            insertToTail(que1);
            sort(que1);
            print(que1);
        }
    }

