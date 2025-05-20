package Day_13_DSA_Impact;

public class CheckSubSequence {
    public static void main(String[] args) {
        CheckSubSequence c = new CheckSubSequence();
        String s = "abc";
        String t = "ahbgdc";
        boolean ans = c.checkSubsequence(s,t,0,0);
        System.out.println(ans);
    }
    public boolean checkSubsequence(String s, String t, int i, int j){
        if( i == s.length()){
            return true;
        }

        if(j == t.length()){
            return false;
        }

        if(s.charAt(i) == t.charAt(j)){
            return checkSubsequence( s, t, i + 1, j + 1);
        }
        else{
            return checkSubsequence( s, t, i, j + 1);
        }
    }
}
