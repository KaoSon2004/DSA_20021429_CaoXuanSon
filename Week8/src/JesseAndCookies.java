import java.util.List;
import java.util.PriorityQueue;

public class JesseAndCookies {

    private static PriorityQueue<Integer> jess = new PriorityQueue<>();
    public static int cookies (int k, List<Integer> A) {
        int ans = 0;
        for (int i = 0; i <A.size(); i++) {
            jess.add(A.get(i));
        }
        while (jess.size() > 1) {
            if (jess.peek() >= k) {
                return ans;
            }
            int c1 = jess.poll();
            int c2 = jess.poll();
            if (c2 < k) {
                return -1;
            }
            int newC = c1 + 2 * c2;
            jess.add(newC);
            ans ++;
        }
        if(jess.size() > 0 && jess.peek() >= k) {
            return ans;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

    }
}
