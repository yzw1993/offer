/**
 * Created by zeweiyang on 2017/8/2.
 */
import java.util.ArrayList;
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> result=new ArrayList<Integer>();
        if (n==0||m==0)
            return result ;
        int layers =(Math.min(n,m)-1)/2+1;
       for (int i =0;i<layers;i++){
           for (int k=i;k<n-i;k++)
                result.add(matrix[i][k]);//从左到右
           for (int j=i+1;j<m-i;j++)
               result.add(matrix[j][n-i-1]);//从上到下
           for (int k=n-i-2;(k>=i)&&(m-i-1!=i);k--)
               result.add(matrix[m-i-1][k]);//从右到左
           for (int j=m-i-2;j>i&&(n-i-1!=i);j--)
               result.add(matrix[j][i]);//从下到上

       }
        return result;
    }
}
