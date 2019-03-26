import java.util.*;
public class RodCutting {
	 public static void main(String args[] ) throws Exception {
         int t,n,c,f;
         Scanner sc=new Scanner(System.in);
         t=sc.nextInt();
         for(int i=0;i<t;i++)
         {
             c=0;
             f=0;
             n=sc.nextInt();
             if(n!=1)
             {
             while(n!=0)
             {
                 if(n%2==0)
                 {
                     f=1;
                 }
                 if(n==1 && f==1)
                 {
                 c--;
                 }
                n=n/2;
                if(n!=1)
                {
                    c++;
                }
             }
             }
             System.out.println(c);
         }
    }
}
