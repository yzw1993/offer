/**
 * Created by zeweiyang on 2017/8/15.
 */
import java.util.ArrayList;
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int start =0;
        int end =array.length-1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        if (array==null||array.length<2)
            return list;
        int product=0;//乘积
        while (start<end){
            if (array[start]+array[end]==sum){
                list.add(array[start]);
                list.add(array[end]);
                start++;
                end--;
                return list;
            }else if (array[start]+array[end]<sum){
                start++;
            }else {
                end--;
            }
        }
        return list;
    }
}
