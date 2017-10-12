///**
// * Created by zeweiyang on 2017/9/14.
// */
//
//        import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            int coinCount = in.nextInt();
//            StringBuilder sb = new StringBuilder();
//            while (coinCount > 0) {
//                if (coinCount % 2 == 0) {
//                    //偶数
//                    coinCount = (coinCount - 2) / 2;
//                    sb.append("2");
//                } else {
//                    //奇数
//                    coinCount = (coinCount - 1) / 2;
//                    sb.append("1");
//                }
//            }
//            System.out.println(sb.reverse().toString());
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString())+Integer.parseInt(s));
//        sc.close();
//    }
//}
////一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的。例如,"aaabbaaac"是由下面碎片组成的:'aaa','bb','c'。牛牛现在给定一个字符串,请你帮助计算这个字符串的所有碎片的平均长度是多少
//链接：https://www.nowcoder.com/questionTerminal/97bc02e432bb4744a9e666b6c93d4479
//        来源：牛客网
//
//        import java.util.ArrayList;
//        import java.util.Scanner;
//        1
//        2
//        3
//        4
//        5
//public class Main {
// public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  String s = sc.nextLine();
//  char[] arr = s.toCharArray();
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
//        11
//        12
//        13
//        14
//        15
//        16
//        17
//        18
//        19
//        20
//        21
//        22
//        23
//  Character t = ' ';
//  String r = "";
//  ArrayList<String> list = new ArrayList<>();
//  for (char c : arr) {
//   if (t!=c) {
//    t = c;
//    if (!r.equals(""))
//     list.add(r);
//     r="";
//   }
//   r += c;
//  }
//  list.add(r);
// 
//  int sum = 0;
//  for (String string : list) {
//   sum+=string.length();
//  }
//  double p =(double)(sum)/list.size();
//  System.out.println(String.format("%1$.2f", p));
//   
// }
//}
////魔法王国一共有n个城市,编号为0~n-1号,n个城市之间的道路连接起来恰好构成一棵树。
//小易现在在0号城市,每次行动小易会从当前所在的城市走到与其相邻的一个城市,小易最多能行动L次。
//        如果小易到达过某个城市就视为小易游历过这个城市了,小易现在要制定好的旅游计划使他能游历最多的城市,请你帮他计算一下他最多能游历过多少个城市(注意0号城市已经游历了,游历过的城市不重复计算)
//        链接：https://www.nowcoder.com/questionTerminal/f58859adc39f4edc9cd8e40ba4160339
//        来源：牛客网
//
//
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
//        11
//        12
//        13
//        14
//        15
//        16
//        17
//        18
//        19
//        20
//        21
//        22
//        23
//        24
//        25
//        26
//        27
//        28
//        29
//        30
//        31
//        32
//        33
//        34
//        35
//        36
//        37
//        38
//        39
//        40
//        41
//        42
//        43
//        44
//        45
//        46
//        47
//        48
//        49
//        50
//        51
//        52
//        53
//        54
//        55
//        56
//        57
//        #include <iostream>
//#include <vector>
//#include <queue>
// 
//         
//        using namespace std;
//         
//        int main()
//        {
//            int n,L;
//            while(cin>>n>>L)
//            {
//                vector<int>in(n-1);
//                for(int i =0; i<n-1; i++) cin>>in[i];
//                queue<int>q;
//                q.push(0);
//                int step = 0;
//                int lvcnt =1;
//                vector<bool>visited(n,false);
//                 
//                while(!q.empty())  //定义一个队列进行层序遍历，找到树的高度
//                {
//                    int tmp = lvcnt;
//                    bool flag =false;
//                    lvcnt =0;
//                    for(int i =0; i<tmp; i++) //pop the same level elements
//                    {
//                        int cur = q.front();
//                        q.pop();
//                        if(visited[cur]) continue;
//                        visited[cur] = true;
//                        flag = true;
//                        for(int j=0; j<n-1; j++)  //find the cntact elements and enque
//                        {
//                            if(cur == in[j])
//                            {
//                                q.push(j+1);
//                                lvcnt++;
//                            }
//                        }
//                        if(cur < n-1 && cur>0)
//                        {
//                            q.push(in[cur-1]);
//                            lvcnt++;
//                        }  
//                    }
//                    if(flag)step++; //判断是否有空层，避免误判
//                }
//                int total =0;
//                for(int i =0; i<n; i++) //万一有不连通节点呢，以防陷阱
//                {
//                    if(visited[i])  total++;
//                }
//                //如果步数连最深节点都遍历不到，那么走一步多遍历一个节点
//                if(L < step) cout<<L+1<<endl;  
//                else//如果遍历完最深节点，还可以多走几步，那么每两步多遍历一个节点
//                {//走法是：先用L-step+1遍历最近的rest个节点，并且回到0号节点，然后用step-1步遍历到最深节点
//        1
//        2
//        3
//        4
//        5
//        6
//                    int rest = (L-step+1)/2;
//                    if(rest+step <= total) cout<<rest+step<<endl; //没有遍历完所有节点，输出遍历的节点数
//                    else cout<<total<<endl; //遍历了所有节点，输出最大节点数
//                }
//            }
//        }
//        //import java.util.HashSet;
//        import java.util.Scanner;
//        import java.util.Set;
//
///*
// * 答案参考@郑耀钧
// *
// * 我原本的思路是：先找出某个括号字符串的左右合法的全排序字符串
// * 然后用动态规划构造找到最大子串方法LCS，最后做统计
// * 不过很遗憾，这个方法超时了。所以参考了@郑耀钧 的解法，如下
// *
// * 根据题意，当且仅当修改距离为 1 时 LCS 最大。
// * 很容易证明对于两种基本序列 (()) 和 ()() 都有距离为 1 的合法修改。
// * 原本想的是对每个左括号，跟每个右括号替换，判断合法后累计。
// * 后来发现会漏掉一些情况，那就暴力得干脆一点，把每个符号插入到任意位置，
// * 判合法，去重，累计。
// */
//public class Demo2 {
//    private static Set<String> set = new HashSet<String>();
//    static int count = 0;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        getSequence(str);
//        System.out.println(set.size() - 1);
//        sc.close();
//
//    }
//
//    private static void getSequence(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            StringBuilder sb = new StringBuilder(str);
//            char c = str.charAt(i);
//            sb.deleteCharAt(i);
//            for (int j = 0; j < str.length(); j++) {
//                sb.insert(j, c);
//                if (isLegal(sb.toString())) {
//                    set.add(sb.toString());
//                }
//                sb.deleteCharAt(j);
//            }
//        }
//    }
//
//    private static boolean isLegal(String s) {
//        int left = s.length() / 2, right = s.length() / 2;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(')
//                left--;
//            else
//                right--;
//            if (right < left)
//                return false;
//        }
//        return true;
//    }
//}
//
////
//1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
//        11
//        12
//        13
//        14
//        15
//        16
//        17
//        18
//        19
//        20
//        21
//        22
//        23
//        24
//        25
//        26
//        27
//        28
//        29
//        30
//        31
//        32
//        33
//        34
//        35
//        36
//        37
//        38
//        39
//        40
//        41
//        import java.util.Scanner;
//        import java.lang.Math;
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] data = new int[n];
//        for (int i=0;i<n;i++){
//            data[i]=sc.nextInt();
//        }
//
//        int[][] dp = new int[n][n];
//        for (int i=0;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                if (j==i+1){
//                    if (i==0){
//                        dp[i][j] = 0;
//                    }else{
//                        int result = Integer.MAX_VALUE;
//                        for (int z=0;z<i;z++){
//                            int current_result = dp[z][i] + Math.abs(data[j]-data[z]);
//                            result = current_result<result?current_result:result;
//                        }
//                        int result_all_A = 0;
//                        for (int z=1;z<j;z++){
//                            result_all_A = result_all_A + Math.abs(data[z]-data[z-1]);
//                        }
//                        dp[i][j] = (result_all_A<result)?result_all_A:result;
//                    }
//                }else{
//                    dp[i][j] = dp[i][j-1]+Math.abs(data[j]-data[j-1]);
//                }
//            }
//        }
//        int final_result = Integer.MAX_VALUE;
//        for (int i=0;i<n-1;i++){
//            final_result = dp[i][n-1]<final_result?dp[i][n-1]:final_result;
//        }
//        System.out.println(final_result);
//    }
//}
//
//        import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] xs = new int[n];
//        int[] ys = new int[n];
//        for (int i = 0; i < n; i++) {
//            xs[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            ys[i] = sc.nextInt();
//        }
//        System.out.println(fun(xs,ys));
//
//    }
//
//    private static int fun(int[] xs, int[] ys) {
//        //两个点以下，直接返回点的个数
//        if(xs.length<=3){
//            return xs.length;
//        }
//
//        Point[] ps = new Point[xs.length];
//        for (int i = 0; i < ps.length; i++) {
//            ps[i] = new Point(xs[i], ys[i]);
//        }
//
//        int max = 0;
//
//        //从第一个点开始遍历，呈垂直和平行的线都算
//        /*
//         * 四层 for循环。前三层确定一个基点
//         */
//        for (int i = 0; i < ps.length; i++) {
//            for (int j = 0; j < ps.length; j++) {
//                if(i!=j){
//                    for (int k = 0; k < ps.length; k++) {
//                        if(k!=i&&k!=j){
//                            int count = 3;
//                            for (int k2 = 0; k2 < ps.length; k2++) {
//                                if(k2!=k&&k2!=i&&k2!=j){
//                                    if(isParellel(ps[i],ps[j],ps[k2])||isVertical(ps[i],ps[j],ps[k],ps[k2])){
//                                        count++;
//                                    }
//                                }
//                            }
//                            max = Math.max(count, max);
//                        }
//                    }
//                }
//            }
//        }
//        return max;
//    }
//    //以i j 点为基准，判断k是否垂直ij线段。
//    private static boolean isVertical(Point ps1, Point ps2, Point ps3,
//                                      Point ps4) {
//        return (ps2.x-ps1.x)*(ps3.x-ps4.x) == (ps2.y-ps1.y)*(ps4.y-ps3.y);
//    }
//
//    //以i j 点为基准，判断k是否平行ij线段。
//    private static boolean isParellel(Point ps, Point ps2, Point ps3) {
//        return (ps2.y-ps.y)*(ps3.x-ps.x) == (ps3.y-ps.y)*(ps2.x-ps.x);
//    }
//
//    static class Point{
//        int x;
//        int y;
//        public Point(int x,int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//}
