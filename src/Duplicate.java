/**
 * Created by zeweiyang on 2017/8/16.
 */
public class Duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
            boolean[] k=new boolean[length];
            for (int i=0;i<k.length;i++){
                if (k[numbers[i]]==true){
                    duplication[0]=numbers[i];
                    return true;
                }
                k[numbers[i]]=true;
            }
            return false;
    }
}
