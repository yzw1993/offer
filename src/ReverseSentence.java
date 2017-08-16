/**
 * Created by zeweiyang on 2017/8/16.
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        char[] chars =str.toCharArray();
        reverse(chars,0,str.length()-1);
        int blank=-1;
        for (int i=0;i<chars.length;i++){
            if (chars[i]==' '){
                int nextBlank=i;
                reverse(chars,blank+1,nextBlank-1);
                blank=nextBlank;
            }
        }
        reverse(chars,blank+1,chars.length-1);
        return new String(chars);

    }
    public void reverse(char[] chars,int low,int high){
        while (low<high){
            char temp =chars[low];
            chars[low]=chars[high];
            chars[high]=temp;
            low++;
            high--;
        }
    }
}
