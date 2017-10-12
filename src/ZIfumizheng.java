import java.util.Scanner;
public class ZIfumizheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            char[][] arr = new char[m][n];
            for (int i = 0; i<m; i++) {
                arr[i] = sc.next().toCharArray();
            }
            String str = sc.next();
            System.out.println(findWord(arr,str));
        }
    }

    public static int findWord(char[][] arr, String str) {
        int m = arr.length;
        int n =  arr[0].length;
        int l = str.length();
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for(int j = 0; j< n; j++) {
                if (arr[i][j] == str.charAt(0)) {
                    for (int k = 0; k<l; k++) {
                        if ( j+k>=n || arr[i][j+k] != str.charAt(k)) break;
                        if (k == l - 1) {
                            ans++;
                        }
                    }
                    for (int k = 0; k<l; k++) {
                        if ( i+k>=m || arr[i+k][j] != str.charAt(k)) break;
                        if (k == l - 1) {
                            ans++;
                        }
                    }
                    for (int k = 0; k<l; k++) {
                        if ( i+k>=m || j+k>=n || arr[i+k][j+k] != str.charAt(k)) break;
                        if (k == l - 1) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}