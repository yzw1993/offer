import java.util.Arrays;

/**
 * Created by zeweiyang on 2017/8/8.
 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int mid =array[array.length/2];
        int count=0;
        for (int i=0;i<array.length;i++){
            if (array[i]==mid)
                count++;
        }
        if (count>array.length/2){
            return mid;
        }else{
            return 0;
        }
    }
}
