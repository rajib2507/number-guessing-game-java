import java.util.*;
public class methodpractice {
    static int rajib(int a,int b){
        int d=a+b;
        System.out.println("a+b="+d);
        int ki=aa(d);
       return d;

    
    }
    static int aa(int d){
        int mi=d/3;
        System.out.println("(a+b)/3="+mi);
        return mi;
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int m=rajib(a,b);
       System.out.println("(a+b)*12="+m*12);
       int k=mm(a,b);
       System.out.println("(a*b)="+k);
       



    }
    static int mm(int a, int b){
        return a*b;
    }
}
