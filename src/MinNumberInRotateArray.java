/**
 * Created by zeweiyang on 2017/7/26.
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
       int start =0;
       int end =array.length-1;
       while(start<end){
           int mid =(start+end)/2;
           if (array[mid]>array[end]){
               start=mid+1;
           }
           else if (array[mid]<array[end]){
                   end=mid;
           }else{
               end =end-1;
           }
       }
       return array[start];
    }
}
