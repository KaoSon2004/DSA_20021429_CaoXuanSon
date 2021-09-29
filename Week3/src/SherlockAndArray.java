public class SherlockAndArray {
    public static String balancedSums(List<Integer> arr) {
        int sum=0;
        int sumleft=0;
        for (int i : arr) {
            sum+=i;
        }
        for (int j : arr) {

            if (sumleft*2==(sum-j)) {
                return "YES";
            }
            sumleft+=j;
        }
        return "NO";
    }
}
