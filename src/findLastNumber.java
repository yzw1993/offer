/**
 * Created by zeweiyang on 2017/8/16.
 */
import java.util.ArrayList;
public class findLastNumber {
    public int LastRemaining_Solution(int n,int m){
        if (m<1||n<1)
            return -1;
        ArrayList<Integer> data =new ArrayList<Integer>();
        for (int i=0;i<n;i++)
            data.add(i);
        int index=-1;
        while (data.size()>1){
            index =(index+m)%data.size();
            data.remove(index);
            index--;
        }
        return data.get(0);
    }
}
