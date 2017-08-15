/**
 * Created by zeweiyang on 2017/8/14.
 */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        if (array==null||array.length==0)
            return 0;
        int first=getFristK(array,0,array.length-1,k);
        int last=getLastK(array,0,array.length-1,k);
        if (first==-1||last==-1)
            return 0;
        return (last-first+1);
    }

    private int getFristK(int[] array,int start,int end,int k){
        while(start<=end){
            int mid=(start+end)>>1;
            if (k<array[mid])
                end=mid-1;
            else if (k>array[mid])
                start=mid+1;
            else {
                if ((mid>0&&array[mid-1]!=k)||mid==0)
                    return mid;
                else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }
    private int getLastK(int[] array,int start,int end,int k){
        while(start<=end){
            int mid=(start+end)>>1;
            if (k<array[mid])
                end=mid-1;
            else if (k>array[mid])
                start=mid+1;
            else {
                if ((mid<array.length-1&&array[mid+1]!=k)||mid==array.length-1)
                    return mid;
                else{
                   start=mid+1;
                }
            }

        }
        return -1;
    }
}
