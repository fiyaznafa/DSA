package misc;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RotateImageMatrixTest {
    @Test
    public void test1(){
        int[][] matrix = {{1,2,3}, {4,5,6},{7,8,9}};
        rotateMatrix1(matrix);
    }

    @Test
    public void test2(){
        int[][] matrix = {{5,1,9,11},{2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        rotateMatrix1(matrix);
    }

    private void rotateMatrix(int[][] matrix) {
        int r = matrix[0].length;
        int c = matrix.length;
        int[][] res = new int[r][c];

        for(int i=0;i<r;i++){
            for (int j = 0; j < c; j++) {
                res[i][j] = matrix[r-(j+1)][i];
            }
        }
//        System.out.println(Arrays.deepToString(res ));
        System.arraycopy(res,0,matrix,0,matrix.length);
    }

    private void rotateMatrix1(int[][] matrix) {
        int r = matrix[0].length;
        int temp;

        for(int i=0;i<r;i++){
            for (int j = i; j < r; j++) {
                if(i!=j){
                    temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<r/2;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][r-(j+1)];
                matrix[i][r-(j+1)]=temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

}
