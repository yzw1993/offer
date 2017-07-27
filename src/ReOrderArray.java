/**
 * Created by zeweiyang on 2017/7/27.
 */
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        int[] temp=new int[array.length];
        int oddnum=0;//奇数个数
        for(int i=0;i<array.length;i++){
            if (array[i]%2==1)
                oddnum++;
        }
        int p1=0;
        int p2=oddnum;
        for(int i=0;i<array.length;i++){
            if (array[i]%2==1){
                temp[p1++]=array[i];
            }
            if (array[i]%2==0){
                temp[p2++]=array[i];
            }

        }
        for (int i=0;i<array.length;i++){
            array[i]=temp[i];
            System.out.print(array[i]);
        }

    }
}
