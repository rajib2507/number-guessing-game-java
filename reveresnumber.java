import java.util.*;
public class reveresnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        int num2=0, n;
        while(num>0){
            n=num%10;
            num2=num2*10 + n;
            num=num/10;


        }
        System.out.println("revers number is : " + num2);

    }
}
