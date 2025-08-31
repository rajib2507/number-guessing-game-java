import java.util.*;
public class recer2 {
    static int sumintt(int n){
        if(n>=0&&n<=9){
            return n;

        }
        int m=sumintt(n/10);
        int ans=m +(n%10);
        return ans;
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumintt(n));

    }
    
}
