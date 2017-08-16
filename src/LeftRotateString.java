/**
 * Created by zeweiyang on 2017/8/16.
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n){
        if (n>str.length())
            return "";
        String s1=str.substring(0,n);
        String s2=str.substring(n,str.length());
        return s2+s1;
    }
}
