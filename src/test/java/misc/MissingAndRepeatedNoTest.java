package misc;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class MissingAndRepeatedNoTest {

    @Test
    public void test1(){
        int[][]grid = {{1,3},{2,2}};
        missingRepeatedNo(grid);
    }

    @Test
    public void test2(){
        int[][]grid = {{9,1,7},{8,9,2},{3,4,6}};
        missingRepeatedNo(grid);
    }

    private void missingRepeatedNo(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int missingNo = 0,repeatedNo = 0;
        for(int[] n:grid){
            for(int no: n){
                if(!set.add(no)) {
                    repeatedNo = no;
                }
            }
        }
        for(int i=1;i<= (grid.length*grid[0].length);i++){
            if(!set.contains(i)) {
                missingNo = i;
                break;
            }
        }
        System.out.println(missingNo+" "+repeatedNo);
    }
}
