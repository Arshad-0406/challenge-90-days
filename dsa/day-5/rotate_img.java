//brute o(n^2) and sc:o(n^2)

//import java.util.*;
//public class rotate_img {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[][]a=new int[n][n];
//        sc.nextLine();
//        for(int i=0;i<n;i++){
//            String[]part=sc.nextLine().split(" ");
//            for(int j=0;j<n;j++){
//                a[i][j]=Integer.parseInt(part[j]);
//            }
//        }
//        int[][]ans=new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//
//                ans[j][n-1-i]=a[i][j];
//
//            }
//        }
//        System.out.print(Arrays.deepToString(ans));
//    }
//}

//optimal

import java.util.*;
public class rotate_img {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]a=new int[n][n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            String[]part=sc.nextLine().split(" ");
            for(int j=0;j<n;j++){
                a[i][j]=Integer.parseInt(part[j]);
            }
        }
        //transpose
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        //reverse every row
        for(int i=0;i<n;i++){
            rev(a[i]);
        }
        System.out.print(Arrays.deepToString(a));
    }
    public static void rev(int[]a) {
        int l=0,right=a.length-1;
        while (l < right) {
            int temp = a[l];
            a[l] = a[right];
            a[right]= temp;
            l++;
            right--;
        }
    }
}