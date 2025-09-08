//brute (or we can use merge sort or any other sorting algorithm)

//import java.util.*;
//public class sortcolor {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[]a=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(a[i]>a[j]){
//                    swap(a,i,j);
//                }
//            }
//        }
//        System.out.print(Arrays.toString(a));
//    }
//    public static void swap(int[]arr,int a,int b){
//        int temp=arr[a];
//        arr[a]=arr[b];
//        arr[b]=temp;
//
//    }
//}

//better o(2n)
//import java.util.*;
//public class sortcolor {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        int cnt0=0,cnt1=0,cnt2=0;
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            if(a[i]==0){
//                cnt0++;
//            }
//            else if(a[i]==1){
//                cnt1++;
//            }
//            else{
//                cnt2++;
//            }
//        }
//        for(int i=0;i<cnt0;i++){
//            a[i]=0;
//        }
//        for(int i=cnt0;i<cnt0+cnt1;i++){
//            a[i]=1;
//        }
//        for(int i=cnt1+cnt0;i<n;i++){
//            a[i]=2;
//        }
//        System.out.print(Arrays.toString(a));
//
//    }
//}

//optimal dutch national flag algorithm o(n)


import java.util.*;
public class sortcolor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(a[mid]==0){
                swap(a,low,mid);
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                swap(a,mid,high);
                high--;
            }
        }
        System.out.print(Arrays.toString(a));
    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}