/**
 * Created by zeweiyang on 2017/8/15.
 */
import java.util.ArrayList;
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
        if (sum<3)
            return lists;
        int small=1;
        int big=2;
        while (small<(1+sum)/2){
            int cueSum=sumOfList(small,big);
            if (cueSum==sum){
                ArrayList<Integer> list=new ArrayList<Integer>();
                for (int i=small;i<=big;i++){
                    list.add(i);
                }
                lists.add(list);
                small++;
                big++;
            }else if (cueSum<sum){
                big++;
            }else{
                small++;
            }

        }
        return lists;
    }
    public int sumOfList(int head,int leap){
        int sum=head;
        for (int i=head+1;i<=leap;i++){
            sum+=i;
        }
        return sum;
    }
}
