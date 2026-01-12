package stackQueue;

import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class TakeGiftRichesTest {

    @Test
    public void test1(){
        int[] gifts = {25,64,9,4,100};
        int k=4;
        pickGifts(gifts,k);
    }

    @Test
    public void test2(){
        int[] gifts = {1,1,1,1};
        int k=4;
        pickGifts(gifts,k);
    }

    private void pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->(b-a));
        for(Integer n : gifts)queue.offer(n);
        while(k>0){
            int n= queue.remove();
            queue.offer((int)Math.sqrt(n));
            k--;
        }
        long sum=0;
       while(!queue.isEmpty()){
           sum+=queue.remove();
       }
        System.out.println(sum);
    }
}
