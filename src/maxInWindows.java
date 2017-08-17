import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by zeweiyang on 2017/8/16.
 */
public class maxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res=new ArrayList<>();
        LinkedList<Integer> indexDeque=new LinkedList<>();
        if (num==null||size<1||size>num.length)
            return res;
        for (int i=0;i<size-1;i++){
            while (!indexDeque.isEmpty()&&num[i]>num[indexDeque.getLast()]){
                indexDeque.removeLast();
            }
            indexDeque.addLast(i);
        }
        for (int i=size-1;i<num.length;i++){
            while (!indexDeque.isEmpty()&&num[i]>num[indexDeque.getLast()]){
                indexDeque.removeLast();
            }
            indexDeque.addLast(i);
            if (i-indexDeque.getFirst()+1>size){
                indexDeque.removeFirst();
            }
            res.add(num[indexDeque.getFirst()]);
        }
        return res;
    }
}
