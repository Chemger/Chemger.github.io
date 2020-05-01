package chemger.java;

import java.util.Arrays;
import java.util.Scanner;

public class Sticks {

    private static int[] array;

    public static int N;
    public static boolean[] isUsed;
    public static int Max;
    public static int sum;
    public static int parts;

    public static boolean DFS(int res, int next, int cpl){
        if(res == Max){
            cpl++;
            res = 0;
            next = N-2;
        }
        if(cpl == parts){
            return true;
        }
        while (next >= 0){
            if (isUsed[next]==false){
                if(res + array[next] <= Max){
                    isUsed[next]=true;
                    if (DFS(res+array[next],next-1,cpl)){
                        return true;
                    }
                    isUsed[next] = false;
                }
            }
            next--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        while ((N=sc.nextInt())!=0){

            array = new int[N];
            isUsed = new boolean[N];
            sum = 0;
            for (int i = 0;i<N;i++){
                array[i] = sc.nextInt();
                sum+=array[i];
            }
            Arrays.sort(array);
            Max = array[N-1];
            for (;Max<=sum;Max++){
                if(sum%Max==0){
                    parts = sum/Max;
                    if (DFS(0,N-1,0)){
                        System.out.println(Max);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
