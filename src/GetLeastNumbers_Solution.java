/**
 * Created by zeweiyang on 2017/8/8.
 */
import java.util.ArrayList;
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if (input==null||input.length==0||input.length<k){
            return list;
        }
        for (int len=k/2-1;len>=0;len--){
            adjustMaxHeapSort(input,len,k-1);
        }
        int tmp;
        for (int i=k;i<input.length;i++){
            if (input[i]<input[0]){
                tmp=input[0];
                input[0]=input[i];
                input[i]=tmp;
                adjustMaxHeapSort(input,0,k-1);

            }
        }
        for (int j=0;j<k;j++){
            list.add(input[j]);
        }
        return list;
    }
    public void adjustMaxHeapSort(int[] input,int pos,int length){
        int temp;
        int child;
        for (temp=input[pos];2*pos+1<=length;pos=child){
            child=2*pos+1;
            if (child<length&&input[child]<input[child+1]){
                child++;
            }
            if (input[child]>temp){
                input[pos]=input[child];
            }else {
                break;
            }
        }
        input[pos]=temp;
    }
}
