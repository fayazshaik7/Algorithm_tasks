import java.util.*;
import java.io.*;
class DescendingWeights{
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        
        List<List<Integer> > bucket=new ArrayList<>();
        for(int i=0;i<k;i++){
            bucket.add(new ArrayList<>());
        }
        
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        
        for(int i=0;i<n;i++){
           List<Integer> bucket_list=bucket.get(list.get(i)%k);
           bucket_list.add(list.get(i));
           bucket.set(list.get(i)%k,bucket_list);
        }
        for(int i=0;i<k;i++){
          Collections.sort(bucket.get(i)); 
        }
       
        for(int i=0;i<k;i++){
            if(bucket.size()>0){
                for(int j:bucket.get(k-1-i)){
                    System.out.print(j+" ");
                }
            }
        }
        System.out.println();
    }
}