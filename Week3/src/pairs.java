public class pairs {
    public static int pairs(int k, List<Integer> arr) {
        int count=0;
        Collections.sort(arr);
        for(int i :arr) {
            if (arr.contains(i+k))
                count++;
        }
        return count;
    }
}
