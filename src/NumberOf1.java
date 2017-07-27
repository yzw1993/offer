/**
 * Created by zeweiyang on 2017/7/27.
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        int count =0;
        int result=n;
      while (result!=0) {
          result = result&(result-1);
          count++;
      }
       return count;
    }
}
