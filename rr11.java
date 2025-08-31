import java.util.*;
public class rr11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int m,ans=0,i=1;
        while(n>0){
            m=n%2;
            n=n/2;
            
            ans=ans+(m*i);
            i=i*10;


        }
        System.out.println(ans);
    }
}
