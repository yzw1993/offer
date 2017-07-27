/**
 * Created by zeweiyang on 2017/7/27.
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        int f1 =1;
        int f2 =1;
        int result =0;
        if (n<1)
            return -1;
        if (n==1||n==2)
            return 1;
        for (int i=2;i<n;i++){
            result =f1+f2;
            f1=f2;
            f2=result;
        }
        return f2;
    }
}
