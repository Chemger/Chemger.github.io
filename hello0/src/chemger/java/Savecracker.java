package chemger.java;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

public class Savecracker {

    public static boolean flag;
    public static int[] num;
    public static char[] c;
    public static char[] chars;
    public static boolean[] used;
    public static int target;

    public static int toNumber(char c){
        return (int)(c-'A')+1;
    }

    public static void DFS(int depth, int sum){
        int tmp;
        if(flag) return;
        if (sum==target&&depth==5){
            System.out.print(chars);
            System.out.println();
            flag = true;
            return;
        }
        else {
            for (int i = num.length-1; i > 0; i--) {

                if (!used[i]) {
                    used[i]=true;
                    tmp=toNumber(c[i]);
                    if (depth==0){
                        chars[depth] = c[i];
                        DFS(depth+1,sum+tmp);
                    }
                    else if (depth==1){
                        chars[depth]=c[i];
                        DFS(depth+1,sum-tmp*tmp);
                    }
                    else if (depth==2){
                        chars[depth]=c[i];
                        DFS(depth+1,sum+tmp*tmp*tmp);
                    }
                    else if (depth==3){
                        chars[depth]=c[i];
                        DFS(depth+1,sum-tmp*tmp*tmp*tmp);
                    }
                    else if (depth==4){
                        chars[depth]=c[i];
                        DFS(depth+1,sum+tmp*tmp*tmp*tmp*tmp);
                    }
                    used[i]=false;
                }
            }
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            target = scanner.nextInt();
            flag = false;
            chars = new char[10];
            String string = scanner.nextLine();
            string=string.replaceAll(" ","");
            if (target==0&&string.compareTo("END")==0){
                break;
            }
            c = string.toCharArray();
            num= new int[c.length];
            used = new boolean[c.length];
            Arrays.fill(used,false);
            for (int i = 0; i < c.length; i++) {
                num[i]=toNumber(c[i]);
            }
            Arrays.sort(num);
            Arrays.sort(c);
            DFS(0,0);
            if (!flag){
                System.out.println("no solution");
            }
        }
    }


}
