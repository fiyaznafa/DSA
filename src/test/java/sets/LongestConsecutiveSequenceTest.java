package sets;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceTest {

    @Test
    public void test1(){
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestSubsequence(nums));
    }

    @Test
    public void test2(){
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestSubsequence(nums));
    }

    @Test
    public void test3(){
        int[] nums = {1,0,1,2};
        System.out.println(longestSubsequence(nums));
    }

    private int longestSubsequence(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n:nums)set.add(n);
        int length , maxLength=0;
        for (int n: nums){
            int temp=n;
            length=1;
            while(set.contains(++temp)){
                length++;
                set.remove(temp);
            }
            temp=n;
            while(set.contains(--temp)){
                length++;
                set.remove(temp);
            }

            maxLength=Math.max(length,maxLength);
        }
        return maxLength;
    }


}
