import java.util.*;
public class rr12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a bionary number:");
        int n=sc.nextInt();
        int m,pw=1;
        int ans=0;
        while(n>0){
            m=n%10;
            n=n/10;
            ans=ans+(m*pw);
            pw=pw*2;

        }
        System.out.println(ans);
    }
}
