import java.util.Scanner;

/**
 * Created by zeweiyang on 2017/9/10.
 */
public class Xunhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int k1 = sc.nextInt();
        int x2 = sc.nextInt();
        int k2 = sc.nextInt();
        compare(x1,k1,x2,k2);
    }
    public static void compare(int x1,int k1,int x2,int k2){
        int num1=newcount(x1,k1);
        int num2=newcount(x2,k2);
        if (num1>num2){
            System.out.print("Greater");
        }else if (num1==num2){
            System.out.print("Equal");
        }else {
            System.out.print("Less");
        }
    }
    public static int newcount(int x,int k){
        int count=1;
        int newcount=x;
        while (x/10!=0){
            count++;
            x/=10;
        }
        int temp=10^(count+1);
        while (k!=0){
            newcount=newcount*temp+x;
            k--;
        }
        return newcount;
    }
}
