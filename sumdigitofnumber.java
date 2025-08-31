import java.util.*;
public class sumdigitofnumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int num=sc.nextInt();
        int m,n=0;
        while(num>0){
            m=num%10;
            n=n+m;
            num=num/10;
            
        }
        System.out.println("sum of all digits is " + n);
    }
}
