import java.util.*;
public class arrmax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr11[]=new int[n];
        for(int i=0;i<n;i++){
            arr11[i]=sc.nextInt();
        }
        int max=arr11[0];
        for(int i=1;i<n;i++){
            if(arr11[i]>max){
                max=arr11[i];
            }
        }
        System.out.println("max value of array is :- " + max);
    }
    
}
