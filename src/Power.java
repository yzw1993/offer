/**
 * Created by zeweiyang on 2017/7/27.
 */
public class Power {
    public double Power(double base, int exponent) {
       int n=0;
       double result=0.0;
       if (exponent>0){
           n=exponent;
       }else if(exponent<0){
           if (base==0)
               throw new RuntimeException("分母不能为0");
           n=-exponent;
        }
        else{
           return 1;
       }
       result =Power(base,n>>1);
       result *=result;
       if ((n&1)==1){
           result*=base;
       }
       if (exponent<0){
           result=1/result;
       }
       return result;
    }
}
