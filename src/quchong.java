import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by zeweiyang on 2017/9/21.
 */
public class quchong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.print(quChong(str));

    }
    public static String quChong(String str){
        if (str==null)
            return "";
        char[] cs=str.toCharArray();
        Set<Character> set =new HashSet<Character>();
        StringBuilder sb=new StringBuilder();
        for (char c:cs){
            if (set.add(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
