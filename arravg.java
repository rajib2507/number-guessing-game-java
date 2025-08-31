import java.util.Scanner;

public class arravg {
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
        float xx=sum;
        float xx1=n;
        float m=xx/xx1;
        System.out.println("average off all array eliments "+ m);

    }
}
