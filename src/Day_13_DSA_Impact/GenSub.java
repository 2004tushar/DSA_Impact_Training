package Day_13_DSA_Impact;

public class GenSub {
    public static void main(String[] args) {
        GenSub g = new GenSub();
        String str = "abc";
        String ans = "";
        g.generateSubsequence(str,ans);
    }
    public void generateSubsequence(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        generateSubsequence(str.substring(1),ans);
        generateSubsequence(str.substring(1),ans + ch);
    }
}
