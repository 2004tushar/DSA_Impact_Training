package Day_13_DSA_Impact;

public class DistinctSubSequence {
    public static void main(String[] args) {
        DistinctSubSequence ds = new DistinctSubSequence();
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(ds.countDistinctSubsequence(s, t, 0, 0));
    }

    public int countDistinctSubsequence(String s, String t, int i, int j) {
        if (j == t.length()) {
            return 1;
        }
        if (i == s.length()) {
            return 0;
        }

        int count = 0;
        if (s.charAt(i) == t.charAt(j)) {
            count += countDistinctSubsequence(s, t, i + 1, j + 1);
        }
        count += countDistinctSubsequence(s, t, i + 1, j);
        return count;
    }
}
