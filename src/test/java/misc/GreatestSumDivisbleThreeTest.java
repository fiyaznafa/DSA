package misc;

import org.testng.annotations.Test;

public class GreatestSumDivisbleThreeTest {

    @Test
    public void test1(){
        int[] nums = {3,6,5,1,8};
        System.out.println(greatestSumByThree(nums));
    }

    @Test
    public void test2(){
        int[] nums = {4};
        System.out.println(greatestSumByThree(nums));
    }

    @Test
    public void test3(){
        int[] nums = {1,2,3,4,4};
        System.out.println(greatestSumByThree(nums));
    }

    @Test
    public void test4(){
        int[] nums = {2,6,2,2,7};
        System.out.println(greatestSumByThree(nums));
    }

    private int greatestSumByThree(int[] nums) {
        int sum=0,rem;
        int min1a = Integer.MAX_VALUE, min1b = Integer.MAX_VALUE;
        int min2a = Integer.MAX_VALUE, min2b = Integer.MAX_VALUE;

        for (int num : nums) {
            sum+=num;
            rem =num%3;

            if(rem==1){
                if(num<min1a){
                    min1b=min1a;
                    min1a=num;
                }
                else if(num<min1b) min1b=min1a;
            }
            else if(rem==2){
                if(num<min2a){
                    min2b=min2a;
                    min2a=num;
                }
                else if(num<min2b)min2b=num;
            }
        }
        rem = sum%3;
        int remove=Integer.MAX_VALUE;
        if(rem==0)return sum;
        else if (rem==1){
            if(min1a!=Integer.MAX_VALUE)remove=min1a;
            if(min2a!=Integer.MAX_VALUE && min2b!=Integer.MAX_VALUE)remove=Math.min(remove,min2a+min2b);
        }
        else {
            if(min2a!=Integer.MAX_VALUE)remove=min2a;
            if(min1a!=Integer.MAX_VALUE && min1b!=Integer.MAX_VALUE)remove=Math.min(remove,min1a+min1b);
        }
        return (remove==Integer.MAX_VALUE?0:sum-remove);
    }
}
