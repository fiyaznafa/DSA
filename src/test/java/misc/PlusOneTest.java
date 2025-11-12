package misc;

import org.testng.annotations.Test;

import java.util.Arrays;

public class PlusOneTest {

    @Test
    public void test1(){
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusone(digits)));
    }

    @Test
    public void test2(){
        int[] digits = {4,3,2,1};
        System.out.println(Arrays.toString(plusone(digits)));
    }

    @Test
    public void test3(){
        int[] digits = {9,9};
        System.out.println(Arrays.toString(plusone(digits)));
    }

    @Test
    public void test4(){
        int[] digits = {1,9};
        System.out.println(Arrays.toString(plusone(digits)));
    }

    private int[] plusoneSecond(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newArr = new int[digits.length+1];
        newArr[0]=1;
        return  newArr;
    }

    private int[] plusone(int[] digits) {
        int sum;
        for(int i=digits.length-1;i>=0;i--){
            sum=digits[i]+1;
            if(sum==10){
                digits[i]=0;
            }
            else {
                digits[i]++;
                return digits;
            }
        }
        int[] newArr = new int[digits.length+1];
        newArr[0]=1;
        return  newArr;
    }

}
