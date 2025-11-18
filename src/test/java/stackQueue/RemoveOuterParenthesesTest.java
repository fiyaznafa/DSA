package stackQueue;

import org.testng.annotations.Test;

public class RemoveOuterParenthesesTest {

    @Test
    public void test1(){
        String s = "(()())(())";
        removeOuter(s);
    }

    @Test
    public void test2(){
        String s = "(()())(())(()(()))";
        removeOuter(s);
    }

    @Test
    public void test3(){
        String s = "()()";
        removeOuter(s);
    }

    @Test
    public void test4(){
        String s = "((())(()))";
        removeOuter(s);
    }


    private String removeOuter(String s) {
        StringBuilder sb = new StringBuilder();
        int leftCount=0,rightCount=0,temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')leftCount++;
            else rightCount++;
            if (leftCount==rightCount){
                for (int j = temp+1; j < i; j++) {
                    sb.append(s.charAt(j));
                }
                temp=i+1;
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    private String removeOuterString(String s){
        StringBuilder sb  = new StringBuilder();
        int balance=0;
        for(Character c : s.toCharArray()){
            if(c=='('){
                if(balance>0)sb.append(c);
                balance++;
            }
            else if(c==')'){
                balance--;
                if(balance>0)sb.append(c);
            }
        }
        return sb.toString();
    }

}
