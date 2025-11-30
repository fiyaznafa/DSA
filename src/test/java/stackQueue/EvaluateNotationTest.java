package stackQueue;

import org.testng.annotations.Test;

import java.util.Stack;

public class EvaluateNotationTest {

    @Test
    public void test1(){
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evaluateExpr(tokens));
    }

    @Test
    public void test2(){
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(evaluateExpr(tokens));
    }

    @Test
    public void test3(){
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evaluateExpr(tokens));
    }

    private int evaluateExpr(String[] tokens) {
        if(tokens.length==1)return Integer.parseInt(tokens[0]);
        int result=0;
        Stack<String> stack = new Stack<>();
        for(String str:tokens){
            if(str.equals("*") || str.equals("/") ||str.equals("+") ||str.equals("-")  ){
                switch (str){
                    case "*" :
                        result=Integer.parseInt(stack.pop())*Integer.parseInt(stack.pop());
                        stack.push(String.valueOf(result));
                        break;
                    case "/" :
                        int a = Integer.parseInt(stack.pop());
                        result=Integer.parseInt(stack.pop())/a;
                        stack.push(String.valueOf(result));
                        break;
                    case "+" :
                        result=Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop());
                        stack.push(String.valueOf(result));
                        break;
                    case "-" :
                        int b=Integer.parseInt(stack.pop());
                        result=Integer.parseInt(stack.pop())-b;
                        stack.push(String.valueOf(result));
                        break;
                }
            }
            else
                stack.push(str);
        }
        return result;
    }


}
