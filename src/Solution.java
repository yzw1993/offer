import java.util.Scanner;


/**
 * Created by zeweiyang on 2017/9/10.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b[]=new int[n];
        for (int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.print(Seven(b));

    }
    public static int Seven(int[] a){
        int length=0;
        int count1=0;
        int count2=0;
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                if(( newNum(a[i],a[j]))%7==0){
                    count1++;
                }
                if (( newNum(a[j],a[i]))%7==0){
                    count2++;
                }
            }
        }
        return count1+count2;

    }
    public static double newNum(int a,int b){
        return a*Math.pow(10,Weishu(b))+b;
    }
    public static int Weishu(int a){
        int weishu=1;
        while (a/10!=0){
            weishu++;
            a/=10;
        }
        return weishu;
    }
}
