/**
 * Created by zeweiyang on 2017/9/16.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ans = new ArrayList<String>();
        int n = sc.nextInt();
        while (n-- > 0) {//注意while处理多个case
            String str = sc.next();
            ans.add(findAnswer(str));
        }
        for(String s : ans) {
            System.out.println(s);
        }
    }

    public static String findAnswer(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (i == 1) continue;
            if (i == 2 || i == 5) {
                ans.append(str.charAt(i));
                continue;
            }
            if (i == 0) {
                String h = str.substring(0,2);
                int hi = Integer.parseInt(h);
                if (hi > 23) {
                    ans.append(((char)48));
                    ans.append(str.charAt(1));
                } else {
                    ans.append(h);
                }
            }
            if (i == 3 || i == 6) {
                String h = str.substring(i,i+2);
                int hi = Integer.parseInt(h);
                if ( hi > 59) {
                    ans.append(((char)48));
                    ans.append(str.charAt(i+1));
                } else {
                    ans.append(h);
                }
            }
        }
        return ans.toString();
    }
}
 */