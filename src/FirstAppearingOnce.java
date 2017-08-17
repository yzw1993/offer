/**
 * Created by zeweiyang on 2017/8/17.
 */
public class FirstAppearingOnce {
    int[] hashtable=new int[256];
    StringBuffer s=new StringBuffer();
    public void Insert(char ch){
        s.append(ch);
        if (hashtable[ch]==0)
            hashtable[ch]=1;
        else hashtable[ch]+=1;
    }
    public char FirstAppearingOnce(){
        char[] str=s.toString().toCharArray();
        for (char c:str){
            if (hashtable[c]==1)
                return c;
        }
        return '#';
    }
}
