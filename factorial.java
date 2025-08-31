import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int add=1;
        for(int i=1;i<=n;i++){
            add=add*i;
        
        }
        System.out.println("factorial of " + n + " is " + add);

    }
}
