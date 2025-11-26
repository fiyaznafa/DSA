package misc;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MaximumProductSubTest {

    @Test
    public void test1(){
        int[] nums = {2,3,-2,4};
        maxProduct(nums);
        maxProductII(nums);
    }

    @Test
    public void test2(){
        int[] nums = {-2,0,-1};
        maxProduct(nums);
        maxProductII(nums);
    }

    @Test
    public void test3(){
        int[] nums = {-2,0,-1,-5};
        maxProduct(nums);
        maxProductII(nums);
    }

    private void maxProduct(int[] nums) {

        int maxProduct=0 , lProduct = 1, rProduct=1;
        if(nums.length==1)maxProduct= nums[0];
        for (int i = 0; i < nums.length; i++) {
            lProduct=lProduct==0?1:lProduct;
            rProduct=rProduct==0?1:rProduct;

            lProduct*=nums[i];
            rProduct*=nums[nums.length-i-1];
            maxProduct=Math.max(maxProduct,Math.max(lProduct,rProduct));
        }
        System.out.println(maxProduct);
    }

    private void maxProductII(int[] nums){
        int min=1,max=1,maxProduct=nums[0],temp=0;
        for (int num : nums) {
            temp = min * num;
            min = Math.min(num, Math.min(min * num, max * num));
            max = Math.max(num, Math.max(temp, max * num));
            maxProduct = Math.max(maxProduct, max);
        }
        System.out.println(maxProduct);
    }
}
