
import java.util.*;

public class FindtheRunningMedian {
    private static PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder());
    private static PriorityQueue<Integer> high = new PriorityQueue<>();


    public static void Medians(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            addNumber(arr.get(i));
            rebalance();
            System.out.println(getMedian());
        }
    }
    public static void addNumber(int number) {
        if (low.size() == 0 || number < low.peek()) {
            low.add(number);
        }
        else {
            high.add(number);
        }
    }

    public static void rebalance() {
        if ((low.size() - high.size()) >= 2) {
            high.add(low.poll());
        }
        if ((high.size() - low.size()) >= 2) {
            low.add(high.poll());
        }
    }

    public static double getMedian() {
        if (low.size() == high.size()) {
            return (low.peek() + high.peek())/2;
        }
        else if(low.size() > high.size()) {
            return low.peek();
        }
        else {
            return high.peek();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
        Medians(arr);
    }
}
