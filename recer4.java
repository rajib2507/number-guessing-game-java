import java.util.*;

public class recer4 {
    static void multixx(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        multixx(n,k-1);
        System.out.println(n*k);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int k=sc.nextInt();
         multixx(n,k);

    }
}
