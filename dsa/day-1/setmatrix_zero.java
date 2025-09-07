//1st-brute force take a duplicate matrix and set elements accordingly

//import java.util.*;
//
//public class setmatrix_zero{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();
//        sc.nextLine();
//        int[][]a=new int[m][n];
//        for(int i=0;i<m;i++){
//            String []s=sc.nextLine().split(" ");
//            for(int j=0;j<n;j++){
//                a[i][j]=Integer.parseInt(s[j]);
//            }
//        }
//        //2 ways to duplicate a matrix:
//        //1 st way
//        /*
//        int[][]copy=new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                copy[i][j]=a[i][j];
//            }
//        }
//         */
//        int[][]copy=new int[m][];
//        for(int i=0;i<m;i++){
//            copy[i]=a[i].clone();
//        }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(a[i][j]==0){
//                    for(int k=0;k<m;k++){
//                        copy[k][j]=0;
//                    }
//                    for(int l=0;l<n;l++){
//                        copy[i][l]=0;
//                    }
//                }
//            }
//        }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                a[i][j]=copy[i][j];
//            }
//        }
//        System.out.print(Arrays.deepToString(a));
//        System.out.print(Arrays.deepToString(copy));
//
//    }
//}

//good solution -maintaining 2 arrays extra.

//import java.util.*;
//
//public class setmatrix_zero{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();
//        sc.nextLine();
//        int[][]a=new int[m][n];
//        for(int i=0;i<m;i++){
//            String []s=sc.nextLine().split(" ");
//            for(int j=0;j<n;j++){
//                a[i][j]=Integer.parseInt(s[j]);
//            }
//        }
//        int[] row=new int[m];
//        int[] col=new int[n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(a[i][j]==0){
//                    row[i]=1;
//                    col[j]=1;
//                }
//            }
//        }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(row[i]==1 || col[j]==1){
//                    a[i][j]=0;
//                }
//            }
//        }
//        System.out.print(Arrays.deepToString(a));
//
//    }
//}

//optimal solution
import java.util.*;

public class setmatrix_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            String[] s = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(s[j]);
            }
        }
        int col0=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==0){
                    a[i][0]=0;
                    if(j!=0){
                        a[0][j]=0;
                    }
                    else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(a[i][j]!=0){
                    if(a[0][j]==0 || a[i][0]==0){
                        a[i][j]=0;
                    }
                }
            }
        }
        if(a[0][0]==0){
            for(int j=0;j<n;j++){
                a[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<m;i++){
                a[i][0]=0;
            }
        }
        System.out.print(Arrays.deepToString(a));
    }
}