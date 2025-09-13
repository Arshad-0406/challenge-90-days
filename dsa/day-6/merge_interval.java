//brute

//import java.util.*;
//
//public class merge_interval {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        int[][]a=new int[n][2];
//        boolean[]removed=new boolean[n];
//        for(int i=0;i<n;i++){
//           a[i][0]=sc.nextInt();
//           a[i][1]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            if(removed[i]){
//                continue;
//            }
//            for(int j=i+1;j<n;j++){
//                if(removed[j]){
//                    continue;
//                }
//                if(overlap(a[i],a[j])){
//                    a[i][0]=Math.min(a[i][0],a[j][0]);
//                    a[i][1]=Math.max(a[i][1],a[j][1]);
//                    removed[j]=true;
//                }
//
//
//            }
//        }
//        List<int[]>res=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            if(!removed[i]){
//                res.add(a[i]);
//            }
//
//        }
//        int[][]ans=res.toArray(new int[res.size()][]);
//        System.out.print(Arrays.deepToString(ans));
//    }
//    public static boolean overlap(int[]a,int[]b){
//        return Math.max(a[0],b[0])<=Math.min(a[1],b[1]);
//    }
//}


//public static void overlap(int[]a,int[]b){
//        int max=-1;
//        int min=100000;
//        for(int i=0;i<2;i++){
//            max=Math.max(a[0],b[0]);
//            min=Math.min(a[1],b[1]);
//
//        }
//        if(max<=min){
//            System.out.print("overlapping");
//        }
//        else{
//            System.out.println("not overlap");
//        }

//}


//optimal

import java.util.*;

public class merge_interval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[][]a=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        Arrays.sort(a,(b,c)->Integer.compare(b[0],c[0]));
        List<int[]>res=new ArrayList<>();
        int[]cur=a[0];
        res.add(cur);
        for(int i=1;i<n;i++){
            int[] next=a[i];
            if(next[0]<=cur[1]){
                cur[1]=Math.max(cur[1],next[1]);

            }
            else{
                cur=next;
                res.add(cur);
            }

        }
        System.out.print(Arrays.deepToString(res.toArray(new int[res.size()][])));
    }
}