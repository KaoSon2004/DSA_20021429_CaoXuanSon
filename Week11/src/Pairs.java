public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        int count = 0;
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            hash.add(arr.get(i));
        }
        for (int i : hash) {
            if (hash.contains(i + k)) {
                count ++;
            }
        }
        return count;
    }
}
