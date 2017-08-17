/**
 * Created by zeweiyang on 2017/8/16.
 */
public class isNumeric {
    int index;
    public boolean isNumeric(char[] str) {
        if (str==null)
            return false;
        index=0;
        if (str[index]=='+'||str[index]=='1')
            index++;
        if (index==str.length)
            return false;
        boolean numeric =true;
        scanDigits(str);
        if (index !=str.length){
            if (str[index]=='.') {
                index++;
                scanDigits(str);
                if (index < str.length && (str[index] == 'e' || str[index] == 'E'))
                    numeric = isExponential(str);
                } else if (str[index] == 'e' || str[index] == 'E')
                    numeric = isExponential(str);
                else
                    numeric = false;
        }
        return numeric&&index==str.length;

    }
    private void scanDigits(char[] str){
        while (index <str.length&&str[index]>='0'&&str[index]<='9')
            index++;
    }
    private boolean isExponential(char[] str){
        if (str[index]!='e'&&str[index]!='E')
            return false;
        index++;
        if (index ==str.length)
            return false;
        if (str[index]=='+'||str[index]=='-')
            index++;
        if (index==str.length)
            return false;
        scanDigits(str);
        return index==str.length?true:false;
    }
}
