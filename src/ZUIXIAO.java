import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by zeweiyang on 2017/9/21.
 */
public class ZUIXIAO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b[]=new int[n];
        for (int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.print(Zuixiao(b));
    }
    public static int Zuixiao(int[] a){
        Arrays.sort(a);
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        int length=a.length;
        int temp=1;
        for (int i=0;i<length;i++){
            hashMap.put(i,a[i]);
        }
        while (hashMap.containsValue(temp)){
            temp++;
        }
        return temp;
    }
}
