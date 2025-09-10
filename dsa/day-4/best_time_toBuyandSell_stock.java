//brute

//import java.util.*;
//public class best_time_toBuyandSell_stock {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        int max=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                max=Math.max(max,a[j]-a[i]);
//            }
//        }
//        System.out.print(max);
//    }
//
//}

//optimal
import java.util.*;
public class best_time_toBuyandSell_stock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0],profit=0;
        for(int i=0;i<n;i++){
            int cost=a[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,a[i]);
        }
        System.out.print(profit);
    }

}
