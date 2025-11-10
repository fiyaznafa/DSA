package stackQueue;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

public class ValidParenthesisTest {

    @Test
    public void test1(){
        String s = "()";
        Assert.assertTrue(isValidParenth(s));
    }

    @Test
    public void test2(){
        String s = "({})";
        Assert.assertTrue(isValidParenth(s));
    }

    @Test
    public void test3(){
        String s = "[{})";
        Assert.assertFalse(isValidParenth(s));
    }

    @Test
    public void test4(){
        String s = "})";
        Assert.assertFalse(isValidParenth(s));
    }

    @Test
    public void test5(){
        String s = "()[]{}";
        Assert.assertTrue(isValidParenth(s));
    }

    @Test
    public void test6(){
        String s = "(";
        Assert.assertFalse(isValidParenth(s));
    }

    private boolean isValidParenth(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{')
                stack.push(c);
            else {
                if(!stack.empty()){
                    char pop = stack.pop();
                    if(pop == '(' && c!=')')return false;
                    if(pop == '[' && c!=']')return false;
                    if(pop == '{' && c!='}')return false;
                }
                else return false;
            }
        }
        return stack.empty();
    }
}
