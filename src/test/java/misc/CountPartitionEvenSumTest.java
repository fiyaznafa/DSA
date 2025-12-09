package misc;

import org.testng.annotations.Test;

public class CountPartitionEvenSumTest {

    @Test
    public void test1(){
        int[] nums ={10,10,3,7,6};
        System.out.println(countPartitions(nums));
    }

    @Test
    public void test2(){
        int[] nums ={1,2,2};
        System.out.println(countPartitions(nums));
    }

    @Test
    public void test3(){
        int[] nums ={2,4,6,8};
        System.out.println(countPartitions(nums));
    }

    private int countPartitions(int[] nums) {
        int count=0,sum=0,currSum=0;
        for (int n:nums)sum+=n;
        for (int i = 0; i < nums.length-1; i++) {
            currSum+=nums[i];;
            int diff = currSum - (sum-currSum);
            if(Math.abs(diff)%2==0)count++;
        }
        return count;
    }
}
