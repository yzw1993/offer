import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by zeweiyang on 2017/9/17.
 */
public class Huiwen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b[]=new int[n];
        for (int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.print(Huiwen(b));
    }
    public static int Huiwen(int[] a){
        int length=a.length;
        int sum=0;
        //统计每个数出现了几次

        /*HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<length;i++){
            int temp=a[i];
            Integer count=map.get(temp);
            if (count==null){
                map.put(temp,1);
            }else {
                map.put(temp,map.get(temp)+1);
            }
        }
        for (int key:map.keySet()){
            if (map.get(key)%2==0){
                sum+=key*map.get(key);
            }else{
                sum+=key*(map.get(key)+1);
            }
        }
       return sum;*/
        int[] b=new int[length];
        for (int i=0;i<length;i++){
            b[i]=a[length-1-i];
        }
    }
}
