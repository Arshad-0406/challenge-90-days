//brute

//import java.util.*;
//public class two_sum {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] a=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        int target=sc.nextInt();
//        int[]res=new int[2];
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(a[i]+a[j]==target){
//                    res[0]=i;
//                    res[1]=j;
//                    break;
//                }
//            }
//        }
//        System.out.print(Arrays.toString(res));
//    }
//}


//if asked without using hash map o(nlogn) sc->o(n)
//import java.util.*;
//public class two_sum {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[][] a=new int[n][2];
//        for(int i=0;i<n;i++){
//            a[i][0]=sc.nextInt();
//            a[i][1]=i;
//        }
//        int target=sc.nextInt();
//        Arrays.sort(a,(x,y)->x[0]-y[0]);
//        int left=0,right=n-1;
//        while(left<right){
//            int sum=a[left][0]+a[right][0];
//            if(sum==target){
//                System.out.print(Arrays.toString(new int[]{a[left][1],a[right][1]}));
//                break;
//            }
//            else if(sum<target){
//                left++;
//            }
//            else{
//                right--;
//            }
//        }
//    }
//}



//optimal o(n)
import java.util.*;
public class two_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]res=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-a[i])){
                res[0]=i;
                res[1]=map.get(target-a[i]);
                break;
            }
            map.put(a[i],i);
        }
        System.out.print(Arrays.toString(res));
    }
}



