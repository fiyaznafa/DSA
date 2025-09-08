package misc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeNoTest {
    @Test
    public void test1(){
        int x = 123321;
        Assert.assertTrue(isPalindromeNo(x));
    }

    @Test
    public void test2(){
        int x = -121;
        Assert.assertFalse(isPalindromeNo(x));
    }

    @Test
    public void test3(){
        int x = 10;
        Assert.assertFalse(isPalindromeNo(x));
    }

    @Test
    public void test4(){
        int x = 2147483647;
        Assert.assertFalse(isPalindromeNo(x));
    }

    @Test
    public void test5(){
        int x = 0;
        Assert.assertTrue(isPalindromeNo(x));
    }
    @Test
    public void test6(){
        int x = 12321;
        Assert.assertTrue(isPalindromeNo(x));
    }




    /*private boolean isPalindromeNo(int num){
        if(num<0 || (num%10==0 && num!=0))return false;
        int temp=num;
        long rev=0;
        while(temp>0){
            rev = (rev*10)+(temp%10);
            temp=temp/10;
        }
        return ((long)num==rev);
    }*/

    private boolean isPalindromeNo(int num) {
        if(num<0 || (num%10==0 && num!=0))return false;
        int rev =0, temp=num;
        while(temp>rev){
            rev = rev*10 + temp%10;
            temp=temp/10;
        }
        return (temp==rev || temp== (rev/10));
    }


}
