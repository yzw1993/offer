import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Finally {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        List<MyTime> list = new ArrayList<MyTime>();
        int listLength = sc.nextInt();
        while (listLength-- > 0) {
            MyTime t = new MyTime();
            t.date = sf.parse(sc.next()+" "+sc.next());
            t.flow = sc.nextInt();
            list.add(t);
        }
        int n = sc.nextInt();
        while (n-- > 0) {
            int ans = 0;
            Date beginTime = sf.parse(sc.next()+" "+sc.next());
            Date endTime = sf.parse(sc.next()+" "+sc.next());
            for (MyTime t : list) {
                if(t.date.compareTo(beginTime) >= 0 && t.date.compareTo(endTime) <= 0) {
                    ans += t.flow;
                }
            }
            System.out.println(ans);
        }
    }
}

class MyTime {
    Date date;
    int flow;
}