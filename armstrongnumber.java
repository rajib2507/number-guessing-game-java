import java.util.*;
public class armstrongnumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        int num2=num;
        int a=0,b;
        while(num>0){
            b=num%10;
            a=a + (b*b*b);
            num=num/10;


        }
        if(num2==a){
            System.out.println(num2 + " is an armstrong number");

        }
        else{
            System.out.println(num2 + " is not an armstrong number");
            
        }
    }
    
}
