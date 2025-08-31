import java.util.Scanner;

public class arrmin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr11[]=new int[n];
        for(int i=0;i<n;i++){
            arr11[i]=sc.nextInt();
        }
        int min=arr11[0];
        for(int i=1;i<n;i++){
            if(arr11[i]<min){
                min=arr11[i];
            }
        }
        System.out.println("max value of array is :- " + min);
    }
}
