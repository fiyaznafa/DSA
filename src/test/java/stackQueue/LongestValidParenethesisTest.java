package stackQueue;

import org.testng.annotations.Test;

import java.util.Stack;

public class LongestValidParenethesisTest {

    @Test
    public void test1(){
        String str = "(()";
        System.out.println(longestParenthesis(str));
    }

    @Test
    public void test2(){
        String str = ")()())";
        System.out.println(longestParenthesis(str));
    }

    @Test
    public void test3(){
        String str = "((()))";
        System.out.println(longestParenthesis(str));
    }

    @Test
    public void test4(){
        String str = ")))((()";
        System.out.println(longestParenthesis(str));
        System.out.println(longParenthesis(str));
    }

    private int longParenthesis(String str) {
        Stack<Integer> stack = new Stack<>();
        int size=0,border=-1;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)=='(')stack.push(i);
            if(str.charAt(i)==')'){
                if(stack.empty())border=i;
                else {
                    stack.pop();
                    if(stack.empty()) size = Math.max(size,i-border);
                    else size = Math.max(size,i-stack.peek());
                }
            }
        }
        return size;
    }

    private int longestParenthesis(String str){
        int noOpen =0, noClosed=0,size=0;
        char c;
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            if(c==')' && noOpen==noClosed){
                noOpen =0;
                noClosed=0;
            }
            else if(c=='(')noOpen++;
            else {
                noClosed++;
                if(noOpen==noClosed)size=Math.max(size,noOpen+noClosed);
            }

        }

        noOpen =0;
        noClosed=0;

        for(int i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            if(c=='(' && noOpen==noClosed){
                noOpen =0;
                noClosed=0;
            }
            else if(c==')')noClosed++;
            else {
                noOpen++;
                if (noOpen == noClosed) size = Math.max(size, noOpen + noClosed);
            }
        }

        return size;
    }
}
