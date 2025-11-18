package stackQueue;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementTest {

    @Test
    public void test1(){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreatest(nums1,nums2)));
        System.out.println(Arrays.toString(nextGreat(nums1,nums2)));
    }

    @Test
    public void test2(){
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreatest(nums1,nums2)));
        System.out.println(Arrays.toString(nextGreat(nums1,nums2)));
    }

    @Test
    public void test3(){
        int[] nums1 = {2};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreatest(nums1,nums2)));
        System.out.println(Arrays.toString(nextGreat(nums1,nums2)));
    }

    private int[] nextGreatest(int[] nums1, int[] nums2) {
        int left=0,right =0,nextGreat;
        int[] res = new int[nums1.length];
        while(left< nums1.length){
            while(nums1[left]!=nums2[right])right++;

            nextGreat=-1;
            for(int i=right+1;i< nums2.length;i++){
                if(nums2[i]>nums1[left]){
                    nextGreat = nums2[i];
                    break;
                }
            }
            res[left]=nextGreat;
            right=0;
            left++;
        }
        return res;
    }

    private int[] nextGreat(int[] nums1,int[] nums2){
        int[] res = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i= nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums2[i]>stack.peek())stack.pop();
            map.put(nums2[i],stack.empty()?-1:stack.peek());
            stack.push(nums2[i]);
        }
        for(int i=0;i< nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}
