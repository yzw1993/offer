import java.util.PriorityQueue;

/**
 * Created by zeweiyang on 2017/8/17.
 */
import java.util.*;
public class GetMedian {
    public StringBuilder str = new StringBuilder();
    public void Insert(Integer num) {
        str.append(num);
    }
    public Double GetMedian() {
        char[] c = str.toString().toCharArray();
        Double result = 0.0;
        Arrays.sort(c);
        if(c.length % 2 == 0){
            result = (c[c.length / 2 - 1] + c[c.length / 2]) / 2.0 - '0';
        }else
            result = (c[(c.length-1)/2]-'0')/1.0;
        return result;
    }
}
