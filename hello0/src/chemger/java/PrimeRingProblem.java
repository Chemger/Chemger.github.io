package chemger.java;


import java.util.Arrays;
import java.util.Scanner;

public class PrimeRingProblem {

    public PrimeRingProblem(int N) {
        this.N = N;
        prime = new boolean[50];
        vis = new boolean[N+1];
        ans = new int[N+1];
        getPrime();
        Arrays.fill(vis,false);
        ans[1]=1;
        p = false;
    }


    private int N;
    private boolean[] prime;
    private boolean[] vis;
    private int[] ans;
    public static boolean p;



    public void getPrime(){
        Arrays.fill(prime,false);
        prime[2]=true;
        for (int i=2;i<50;i++){
            boolean flag = true;
            for (int j=2;j*j<i;j++){
                if (i%j==0) {
                    flag=false;
                    break;
                }
            }
            if (flag){
                prime[i]=true;
            }
        }
        prime[1]=true;
        vis[1]=true;
    }

    public void DFS(int depth){
        if(depth>N){
            if(prime[ans[depth-1]+1]){
                for (int i = 1;i<=N;i++){
                    if (i<N) {
                        System.out.print(ans[i]+" ");
                    }
                    else {
                        System.out.println(ans[i]);
                    }
                }
            }
            return;
        }
        for (int i = 2;i <= N;i++){
            if(!vis[i]&&prime[i+ans[depth-1]]){
                vis[i] = true;
                ans[depth]=i;
                DFS(depth+1);
                vis[i]=false;
            }
        }

    }

    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            cnt++;
            PrimeRingProblem primeRingProblem = new PrimeRingProblem(sc.nextInt());

            System.out.println("Case " + cnt + ":");
            primeRingProblem.DFS(2);
            System.out.println();
        }
    }
}
