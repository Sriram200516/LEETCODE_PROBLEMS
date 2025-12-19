class Solution{
    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="  Hello   World  ";
        String reversed=sol.reverseWords(s);
        System.out.println("Reversed Words: \"" + reversed + "\"");
    }
    public String reverseWords(String s){
        String[] words=s.trim().split("\\s+");
        java.util.Collections.reverse(java.util.Arrays.asList(words));
        return String.join(" ",words);
    }
}
