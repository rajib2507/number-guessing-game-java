import java.util.*;
public class sortarr01 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("array size : ");
        int n=sc.nextInt();
        int arr1[] = new int[n];
        int count0=0;
        for(int i=0;i<n;i++){
            System.out.print("for this array enter "+(i+1)+" element : ");
            arr1[i]=sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
    System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for(int i=0;i<n;i++){
            
            if(arr1[i]==0){
                count0++;
            }
            

        }
        for(int i=0;i<n;i++){
            if(i<count0){
                arr1[i]=0;
            }
            else{
                arr1[i]=1;
            }
        }
        System.out.print("after shorting the array : ");
        for (int i = 0; i < n; i++) {
    System.out.print(arr1[i] + " ");
        }



    }
}
