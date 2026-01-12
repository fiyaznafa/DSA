import org.testng.annotations.Test;

public class SortedDuplicateTest {

    /*
    You are given a sorted array (may contain duplicates) and an integer n.
Find the index of the first occurrence of an element that is >= n.
If no such element exists, return -1.
🔹 Example 1
Input:
arr = [1, 2, 2, ,3,4,4, 4, 5, 7]n = 4
int index = 3;
Output:3

Input:
arr = [1, 2, 2, 4, 4, 5, 7]n = 3
Output:4

arr = [1, 2, 2, 4, 4, 5, 7]n =6
Output:7

arr = [1, 2, 2, 4, 4, 5, 7]n =9
Output:-1

     */
    @Test
    public void test1(){
        int[] arr = {1, 2, 2, 4, 4, 5, 7};
        int n=4;
        searchSorted(arr,4);
    }

    @Test
    public void test2(){
        int[] arr = {1, 2, 2, 4, 4, 5, 7};
        int n=4;
        searchSorted(arr,n);
    }

    @Test
    public void test3(){
        int[] arr = {1, 2, 2, 4, 4, 5, 7};
        int n=6;
        searchSorted(arr,n);
    }

    private int searchSorted(int[] arr,int n) {
        int left =0, right = arr.length-1, foundIndex=-1,mid=0;

        while(left<=right){
            mid = left + (right-left)/2;
            if(arr[mid]>=n){
                foundIndex=mid;

                right = mid-1;
            }
            else left=mid+1;
        }
        System.out.println(foundIndex);
        return foundIndex;
    }

}
