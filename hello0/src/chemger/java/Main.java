package chemger.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean[] used;
    public static int[] ans;
    public static int[] pc;
    public static int n;
    public static int sum;



    private static boolean DFS(int i, int num, int val){
        if (val>sum){
            return false;
        }
        if(i==n){
            if (val==sum){
                ans[i] = num;
                return true;
            }
            else return false;

        }
        used[num] = true;
        for (int j = 1; j <= n ; j++) {
            if (!used[j]&&DFS(i+1,j,val+pc[i]*j)){
                ans[i]=num;
                return true;
            }
        }
        used[num] = false;
        return false;

    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        sum=scanner.nextInt();
        pc = new int[12];
        used = new boolean[13];
        ans = new int[13];
        Arrays.fill(used,false);
        pc[0] = 1;
        pc[n-1] = 1;
        if (n>1){
            for (int i = 1; i * 2 < n; i++) {
                pc[i]=pc[n-1-i]=(n-i)*pc[i-1]/i;
            }
            if (DFS(0,0,0)){
                for (int i = 1; i <= n ; i++) {
                    System.out.print(ans[i]);
                }
            }
        }
    }
}
