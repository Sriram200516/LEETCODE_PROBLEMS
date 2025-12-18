public class RemoveOuterMostParenthesis {
    public static void main(String[] args) {
        RemoveOuterMostParenthesis romp=new RemoveOuterMostParenthesis();
        String s="(()())(())(()(()))";
        String result=romp.removeOuterParentheses(s);
        System.out.println("Result after removing outermost parentheses: \"" + result + "\"");
    }
    
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int balance=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(balance>0){
                    result.append(c);
                }
                balance++;
            }else{
                balance--;
                if(balance>0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}