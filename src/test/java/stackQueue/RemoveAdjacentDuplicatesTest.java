package stackQueue;

import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class RemoveAdjacentDuplicatesTest {

    @Test
    public void test1(){
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    @Test
    public void test2(){
        String s = "azxxzy";
        System.out.println(removeDuplicates(s));
    }

    @Test
    public void test3(){
        String s = "aaa";
        System.out.println(removeDuplicates(s));
    }

    private String removeDuplicates(String s) {
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for(Character c : s.toCharArray()){
            if(!queue.isEmpty() && queue.peek()==c)queue.pop();
            else
                queue.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty())sb.append(queue.pop());
        return sb.reverse().toString();
    }
}
