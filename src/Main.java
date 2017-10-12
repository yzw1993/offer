/**
 * Created by zeweiyang on 2017/7/25.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int j=sc.nextInt();
            int[] array=new int[j];
            for(int k=0;k<j;k++){
                array[k]=sc.nextInt();
            }
            isSuit(array);
        }


    }
    public static void isSuit(int[] array){
        int jishu=0;
        int fourbeishu=0;
        int length=array.length;
        for (int i=0;i<length;i++){
            if (array[i]%2==1){
                jishu++;
            }
            if (array[i]%2==0){
                if (array[i]%4==0){
                    fourbeishu++;
                }
            }
        }
        if (fourbeishu>=jishu){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}