/**
 * Created by zeweiyang on 2017/7/25.
 */
public class BinarySearch {
    public boolean Find(int target, int [][] array) {
        int m =array.length-1;
        int n =0;
        while((m>=0)&&(n<=array[0].length-1)){
            if (target>array[m][n])
                n++;
            else if (target<array[m][n])
                m--;
            else
                return true;
        }
        return false;
    }
}
