/**
 * Created by zeweiyang on 2017/7/25.
 */
public class ReplaceBlank {
    public String replaceSpace(StringBuffer str) {
        int oldlength=str.length();
        int blanknum=0;
        for (int i=0;i<oldlength;i++){
            if (str.charAt(i)==' ')
                blanknum++;
        }
        int newlength=oldlength+2*blanknum;
        int newindex=newlength-1;
        str.setLength(newlength);
        for (int oldindex=oldlength-1;oldindex>=0;oldindex--){
            if (str.charAt(oldindex)==' '){
                str.setCharAt(newindex--,'0');
                str.setCharAt(newindex--,'2');
                str.setCharAt(newindex--,'%');
            }
            else
                str.setCharAt(newindex--,str.charAt(oldindex));
        }
        return str.toString();


    }
}
