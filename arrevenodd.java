import java.util.*;
public class arrevenodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr1[]={2,4,6,7,3,5};
        int m=arr1.length;
        for(int i=0;i<m;i++){
            if(arr1[i]%2==0){
                System.out.println(arr1[i]+"is a even number");
            }
            else{
                System.out.println(arr1[i]+"is a odd number"); 
            }
        }


    }
}
