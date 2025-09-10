//brute

//import java.util.*;
//
//public class pascal_triangle {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int r=sc.nextInt();
//        List<List<Integer>>res=new ArrayList<>();
//        for(int i=1;i<=r;i++){
//            List<Integer>cur=new ArrayList<>();
//            for(int j=1;j<=i;j++){
//                cur.add(ncr(i-1,j-1));
//            }
//            res.add(cur);
//        }
//        System.out.print(res);
//    }
//    public static int ncr(int n,int r){
//        int res=1;
//        for(int i=0;i<r;i++){
//            res=res*(n-i);
//            res=res/(i+1);
//        }
//        return res;
//    }
//}


import java.util.*;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        List<List<Integer>>final_res=new ArrayList<>();
        final_res=pascal(r);
        System.out.print(final_res);
    }
    public static List<List<Integer>> pascal(int n){
        List<List<Integer>>triangle=new ArrayList<>();
        for(int i=1;i<=n;i++){
            triangle.add(generaterow(i));
        }
        return triangle;
    }
    public static List<Integer> generaterow(int r){
        long res=1;
        List<Integer>ans=new ArrayList<>();
        ans.add(1);
        for(int i=1;i<r;i++){
            res=res*(r-i);
            res=res/i;
            ans.add((int) res);
        }
        return ans;
    }
}
