import java.util.*;
public class numberofdigitsfind {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n =sc.nextInt();
        int a=0;
        while(n>0){
            n=n/10;
            a++;
        }
        System.out.println(a);

    }
    
}
