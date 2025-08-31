import java.util.*;
public class arr1a {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array range: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
    
        for(int i=(n-1);i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int m= arr.length;
        System.out.println("array length : "+ m);
        int minarr=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<minarr){
                minarr=arr[i];
            }
        }
        System.out.println("minimum arr : "+minarr);
    

        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of all array eliments : "+sum);
        int avg=sum/n;
        System.out.println("average of all array eliment : "+avg);

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println("even aliment is : "+arr[i]);

            }
            else{
                System.out.println("odd eliment is : "+arr[i]);

            }
        }
        System.out.println("enter the number what are you want to search : ");
        int sear=sc.nextInt();
         boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i]==sear){
                System.out.println("Element found at position: " + (i+1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }

        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        int maxeli=0;
        int senmax=0;
        if(arr[0]>arr[1]){
            maxeli=arr[0];
            senmax=arr[1];
        }
        else{
            maxeli=arr[1];
            senmax=arr[0];

        }
        for(int i=2;i<n;i++){
            if(arr[i]>maxeli && arr[i]>senmax){
                senmax=maxeli;
                maxeli=arr[i];
            }
            else if(arr[i]>senmax && arr[i]<maxeli){
                senmax=arr[i];
            }
            
            
        }
        System.out.println("second max is :"+ senmax);



    }
}
