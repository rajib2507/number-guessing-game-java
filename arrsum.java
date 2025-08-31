import java.util.*;
public class arrsum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr11[]=new int[n];
        for(int i=0;i<n;i++){
            arr11[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            System.out.print(arr11[i]+" ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+(arr11[i]);

        }
        System.out.println("sum of all array eliments "+sum);

    }
}
