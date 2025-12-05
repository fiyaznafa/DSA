package stackQueue;

import org.testng.annotations.Test;

import java.util.Stack;

public class CountCollistionsRoadTest {

    @Test
    public void test1(){
        String directions = "RLRSLL";
        collisionCount(directions);
    }

    @Test
    public void test2(){
        String directions = "LLRR";
        collisionCount(directions);
    }

    @Test
    public void test3(){
        String direction ="SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR";
        collisionCount(direction);
    }


    @Test
    public void test4(){
        String direction ="RRRL";
        collisionCount(direction);
    }

    private void collisionCount(String directions) {
        int noOfCollisions = 0;
        Stack<Character> stack = new Stack<>();
        for (Character c : directions.toCharArray()){
            if(!stack.empty() && c=='L'){
                if(stack.peek()=='R'){
                    noOfCollisions+=2;
                    stack.pop();
                    c='S';
                }
                else {
                    noOfCollisions++;
                }
            }
            if(c=='R'){
                if(!stack.empty()){
                    if(stack.peek()=='S')stack.pop();
                }
                stack.push('R');
            }
            else if(c=='S'){
                if(!stack.empty()){
                    while (!stack.empty() && stack.peek()=='R'){
                        noOfCollisions++;
                        stack.pop();
                    }
                }
                if(stack.empty())
                    stack.push(c);
            }
        }
        System.out.println(noOfCollisions);
    }

}
