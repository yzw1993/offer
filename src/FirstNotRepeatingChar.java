/**
 * Created by zeweiyang on 2017/8/11.
 */
import java.util.HashMap;
public class FirstNotRepeatingChar {
    HashMap<Character,Integer> map=new HashMap<>();
    public int FirstNotRepeatingChar(String str) {
        if (str==null)
            return -1;
        int length=str.length();
        for (int i=0;i<length;i++){
            if (map.containsKey(str.charAt(i))){
                int value =map.get(str.charAt(i));
                map.put(str.charAt(i),value+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for (int i=0;i<length;i++){
            if (map.get(str.charAt(i))==1)
                return i;
        }
        return -1;

    }
}
