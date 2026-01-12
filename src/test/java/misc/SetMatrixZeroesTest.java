package misc;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SetMatrixZeroesTest {

    @Test
    public void test1(){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setMatrixZero(matrix);
//        setMatrixZeroII(matrix);
    }

    @Test
    public void test2(){
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//        setMatrixZero(matrix);
        setMatrixZeroII(matrix);
    }

    private void setMatrixZero(int[][] matrix) {
        int[] col = new int[matrix[0].length];
        int[] row = new int[matrix.length];

        for(int i=0;i<row.length;i++){
            for (int j = 0; j < col.length; j++) {
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            for (int j = 0; j < col.length; j++) {
                if(row[i]==1 || col[j]==1)matrix[i][j]=0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    private void setMatrixZeroII(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        int col0=1;

        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]==0){
                   matrix[i][0]=0;
                   if(j!=0)
                    matrix[0][j]=0;
                   else col0=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for (int j = 1; j < m; j++) {
                if(matrix[i][j]!=0){
                    if(matrix[0][j]==0 || matrix[i][0]==0)
                        matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for (int j = 0; j < m; j++) {
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for (int i = 0; i < n; i++) {
                matrix[i][0]=0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }


}
