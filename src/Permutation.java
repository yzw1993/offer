/**
 * Created by zeweiyang on 2017/8/7.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res=new ArrayList<String>();
        if (str==null||str.length()==0)
            return res;
        HashSet<String> set =new HashSet<String>();
        fun(set,str.toCharArray(),0);
        res.addAll(set);
        Collections.sort(res);
        return res;
    }
    public void fun(HashSet<String> res,char[] str,int k){
        if (k==str.length){
            res.add(new String(str));
            return;
        }
        for(int i=k;i<str.length;i++){
            swap(str,i,k);
            fun(res,str,k+1);
            swap(str,i,k);
        }
    }

    public void swap(char[] str,int i,int j){
        if (i!=j){
            char t =str[i];
            str[i]=str[j];
            str[j]=t;
        }
    }
}
