/**
 * Created by zeweiyang on 2017/8/11.
 */
public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0)
            return 0;
        int[] result=new int[index];
        result[0]=1;
        int begin=1,m2=0,m3=0,m5=0;
        while (begin<index){
            result[begin]=min(result[m2]*2,result[m3]*3,result[m5]*5);
            while (result[m2]*2==result[begin])
                m2++;
            while (result[m3]*3==result[begin])
                m3++;
            while(result[m5]*5==result[begin])
                m5++;
            begin++;
        }
        return result[index-1];
    }
    public int min(int i,int j,int k){
        int temp=i<j?i:j;
        return temp<k?temp:k;
    }
}
