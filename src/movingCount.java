/**
 * Created by zeweiyang on 2017/8/17.
 */
public class movingCount {
    public int movingCount(int threshold, int rows, int cols) {
        if(threshold<0)
            return 0;
        boolean [][] dp=new boolean[rows+1][cols+1];
        dp[0][0]=true;
        for(int i=1;i<=rows;i++){//初始化
            if(dp[i-1][0]&&canreach(threshold,i,0)){
                dp[i][0]=true;
            }else {
                dp[i][0]=false;
            }
        }
        for(int i=1;i<=cols;i++){//初始化
            if(dp[0][i-1]&&canreach(threshold,0,i)){
                dp[0][i]=true;
            }else {
                dp[0][i]=false;
            }
        }
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=cols;j++){
                if ((dp[i-1][j]&&canreach(threshold, i, j))||(dp[i][j-1]&&canreach(threshold, i, j))){
                    dp[i][j]=true;
                }else {
                    dp[i][j]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(dp[i][j])
                    count++;
            }
        }
        return count;
    }
    public  boolean canreach(int threshold, int x, int y) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        while (y > 0) {
            sum += y % 10;
            y /= 10;
        }
        return sum <= threshold;
    }
}
