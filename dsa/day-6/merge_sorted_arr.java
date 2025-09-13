//brute

//import java.util.*;
//
//public class merge_sorted_arr {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();
//        int[]a=new int[m+n];
//        int[]b=new int[n];
//        for(int i=0;i<m;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            b[i]=sc.nextInt();
//        }
//        int[]res=new int[m+n];
//        int i=0,j=0,k=0;
//        while(i<m&&j<n){
//            if(a[i]<=b[j]){
//                res[k++]=a[i++];
//            }
//            else{
//                res[k++]=b[j++];
//            }
//        }
//        while(i<m){
//            res[k++]=a[i++];
//        }
//        while(j<n){
//            res[k++]=b[j++];
//        }
//        for(int idx=0;idx<m+n;idx++){
//            a[idx]=res[idx];
//        }
//        System.out.print(Arrays.toString(a));
//
//    }
//}



//brute

//import java.util.*;
//
//public class merge_sorted_arr {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();
//        int[]a=new int[m+n];
//        int[]b=new int[n];
//        for(int i=0;i<m;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            b[i]=sc.nextInt();
//        }
//        for(int i=0;i<m+n;i++){
//            if(a[i]>b[0]){
//                int temp=a[i];
//                a[i]=b[0];
//                b[0]=temp;
//                Arrays.sort(b);
//            }
//
//        }
//        for(int i=0;i<n;i++){
//            a[m+i]=b[i];
//        }
//        System.out.print(Arrays.toString(a));
//
//    }
//}

//
//import java.util.*;
//
//public class merge_sorted_arr {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();
//        int[]a=new int[m+n];
//        int[]b=new int[n];
//        for(int i=0;i<m;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            b[i]=sc.nextInt();
//        }
//        int l=m-1;
//        int r=0;
//        while(l>=0 && r<n){
//            if(a[l]>b[r]){
//                int temp=a[l];
//                a[l]=b[r];
//                b[r]=temp;
//                l--;
//                r++;
//            }
//            else{
//                break;
//            }
//        }
//        Arrays.sort(a,0,m);
//        Arrays.sort(b);
//        for(int i=0;i<n;i++){
//            a[m+i]=b[i];
//        }
//        System.out.print(Arrays.toString(a));
//
//    }
//}


//chatgpt gap method

//import java.util.*;
//
//public class merge_sorted_arr {
//
//    private static int nextGap(int gap) {
//        if (gap <= 1) return 0;
//        return (gap + 1) / 2;
//    }
//
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int total = m + n;
//        int gap = nextGap(total);
//
//        while (gap > 0) {
//            int i = 0;
//            int j = i + gap;
//
//            while (j < total) {
//                // Case 1: both in nums1
//                if (i < m && j < m) {
//                    if (nums1[i] > nums1[j]) {
//                        int temp = nums1[i];
//                        nums1[i] = nums1[j];
//                        nums1[j] = temp;
//                    }
//                }
//                // Case 2: i in nums1, j in nums2
//                else if (i < m && j >= m) {
//                    int j2 = j - m;
//                    if (nums1[i] > nums2[j2]) {
//                        int temp = nums1[i];
//                        nums1[i] = nums2[j2];
//                        nums2[j2] = temp;
//                    }
//                }
//                // Case 3: both in nums2
//                else {
//                    int i2 = i - m;
//                    int j2 = j - m;
//                    if (nums2[i2] > nums2[j2]) {
//                        int temp = nums2[i2];
//                        nums2[i2] = nums2[j2];
//                        nums2[j2] = temp;
//                    }
//                }
//                i++;
//                j++;
//            }
//
//            gap = nextGap(gap);
//        }
//
//        // Copy nums2 into nums1
//        for (int k = 0; k < n; k++) {
//            nums1[m + k] = nums2[k];
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Read nums1
//        System.out.print("Enter size of nums1 valid part (m): ");
//        int m = sc.nextInt();
//        System.out.print("Enter size of nums2 (n): ");
//        int n = sc.nextInt();
//
//        int[] nums1 = new int[m + n];
//        int[] nums2 = new int[n];
//
//        System.out.println("Enter elements of nums1:");
//        for (int i = 0; i < m; i++) nums1[i] = sc.nextInt();
//
//        System.out.println("Enter elements of nums2:");
//        for (int i = 0; i < n; i++) nums2[i] = sc.nextInt();
//
//        merge(nums1, m, nums2, n);
//
//        System.out.println("Merged nums1 array:");
//        System.out.println(Arrays.toString(nums1));
//    }
//}



//optimal

import java.util.*;

public class merge_sorted_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[]a=new int[m+n];
        int[]b=new int[n];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0&&j>=0){
            if(a[i]>b[j]){
                a[k--]=a[i--];
            }
            else{
                a[k--]=b[j--];
            }
        }
        while(j>=0){
            a[k--]=b[j--];
        }
        System.out.print(Arrays.toString(a));

    }
}