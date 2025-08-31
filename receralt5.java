import java.util.*;
public class receralt5 {
    
    static int rrr(int n){
        
        if(n==0){
            
            return 0;
        }
        if(n%2==0){
            return rrr(n-1)-n;
        }
        else{
            return rrr(n-1)+n;
        }
        
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println (rrr(n));
         
    }
}
