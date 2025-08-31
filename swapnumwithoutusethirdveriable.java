import java.util.*;
public class swapnumwithoutusethirdveriable {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number a: ");
        int a=sc.nextInt();
        System.out.print("enter second number b: ");
        int b=sc.nextInt();
        System.out.println("befor swaping a= " + a + " and b= " + b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping a = " + a + " and b = " + b);
        

    }
}
