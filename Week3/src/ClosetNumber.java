public class ClosetNumber {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        List <Integer> ans= new ArrayList<>();
        int mi = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 1; i < arr.size(); i++ ) {
            if ((arr.get(i) - arr.get(i-1)) < mi) {
                mi = arr.get(i) - arr.get(i-1);
            }
        }
        for (int i : arr) {
            if (arr.contains(i+mi)) {
                ans.add(i);
                ans.add(i+mi);
            }
        }
        return ans;
    }
}
