package misc;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ProductArrayTest {

    @Test
    public void test1(){
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productArray(nums)));
    }

    @Test
    public void test2(){
        int[] nums={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productArray(nums)));
    }

    private int[] productArray(int[] nums) {
        int n = nums.length,mult=1;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=mult;
            mult*=nums[i];
        }
        mult=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=mult;
            mult*=nums[i];
        }
        return ans;
    }


}
