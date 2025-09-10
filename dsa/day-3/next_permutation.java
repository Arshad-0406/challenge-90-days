//brute  o(n^3logn) and sc:o(n)

//import java.util.*;
//public class next_permutation {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[]a=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        int val = 0;
//        for (int digit : a) {
//            val = val * 10 + digit;
//        }
//        int min=Integer.MAX_VALUE;
//        int[]best =Arrays.copyOf(a,n);
//        for(int i=n-1;i>=0;i--){
//            for(int j=0;j<i;j++){
//                int[] temp=Arrays.copyOf(a,n);
//                swap(a,i,j);
//                Arrays.sort(a, j+1, n);
//                int num = 0;
//                for (int digit : a) {
//                    num = num * 10 + digit;
//                }
//
//                if(num>val && num<min){
//                    min=num;
//                    best=Arrays.copyOf(a,n);
//                }
//
//                a=Arrays.copyOf(temp,n);
//
//
//            }
//
//        }
//        if(min==Integer.MAX_VALUE){
//            rev(a);
//        }
//        else{
//            System.out.print(Arrays.toString(best));
//        }
//
//    }
//    public static void swap(int[] a,int i,int j){
//        int temp=a[i];
//        a[i]=a[j];
//        a[j]=temp;
//    }
//    public static void rev(int[]a){
//        int l=0;
//        int right=a.length-1;
//        while(l<right){
//            int temp=a[l];
//            a[l]=a[right];
//            a[right]=temp;
//            l++;
//            right--;
//        }
//        System.out.print(Arrays.toString(a));
//    }
//}

//sorting List<list<>>
//res.sort((a1, b) -> {
//        int n1 = Math.min(a1.size(), b.size());
//        for (int i = 0; i < n1; i++) {
//        if (!a1.get(i).equals(b.get(i))) {
//        return a1.get(i) - b.get(i);
//        }
//        }
//        return a1.size() - b.size();
//        });

//import java.util.*;
//public class next_permutation {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[]a=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        boolean[]flag=new boolean[n];
//        List<List<Integer>>res=new ArrayList<>();
//        int[] originalArr = Arrays.copyOf(a, n);
//        Arrays.sort(a);
//        recursion(new ArrayList<>(),res,a,flag);
//        List<Integer> original = new ArrayList<>();
//        for (int x : originalArr) original.add(x);
//
//        int index = -1;
//        for (int i = 0; i < res.size(); i++) {
//            if (res.get(i).equals(original)) {
//                index = i;
//                break;
//            }
//        }
//        List<Integer> next = res.get((index + 1) % res.size());
//        System.out.println("Next permutation: " + next);
//
//    }
//    public static void recursion(List<Integer>cur,List<List<Integer>>res,int[]a,boolean[]flag){
//        if(cur.size()==a.length){
//            res.add(new ArrayList<>(cur));
//            return;
//        }
//        for(int i=0;i<a.length;i++){
//            if(!flag[i]){
//                if (i > 0 && a[i] == a[i - 1] && !flag[i - 1]) continue;
//
//                flag[i]=true;
//                cur.add(a[i]);
//                recursion(cur,res,a,flag);
//                cur.remove(cur.size()-1);
//                flag[i]=false;
//            }
//            }
//    }
//}



//optimal
import java.util.*;
public class next_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(a[i]<a[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            rev(a,0,n-1);
            System.exit(0);
        }
        for(int i=n-1;i>index;i--){
            if(a[i]>a[index]){
                swap(a,i,index);
                break;
            }
        }
        rev(a,index+1,n-1);
        System.out.print(Arrays.toString(a));
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void rev(int[]a,int l,int right){
        while(l<right){
            int temp=a[l];
            a[l]=a[right];
            a[right]=temp;
            l++;
            right--;
        }
    }

}