//brute o(n^3)

//import java.util.*;
//public class MaximumSubarray {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i]=sc.nextInt();
//        }
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                int sum=0;
//                for(int k=i;k<=j;k++){
//                    sum+=a[k];
//                }
//                max=Math.max(sum,max);
//            }
//        }
//        System.out.print(max);
//    }
//}


//better o(n^2) avoids inner loop again (adds next element instead of looping again)

//import java.util.*;
//public class MaximumSubarray {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//           a[i]=sc.nextInt();
//        }
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            int sum=0;
//            for(int j=i;j<n;j++){
//                sum+=a[j];
//                max=Math.max(sum,max);
//            }
//        }
//        System.out.print(max);
//    }
//}

//optimal [kadane algorithm] if sum is negative dont carry it further
//o(n)
import java.util.*;
public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
           a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }

        }
        System.out.print(max);
    }
}


