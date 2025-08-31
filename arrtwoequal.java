import java.util.Arrays;

public class arrtwoequal {
    public static void main(String args[]){
        int arr1[]={1,2,3,4};
        int arr2[]={1,2,3,4};
        boolean isEqual = Arrays.equals(arr1, arr2);
        if(isEqual){
            System.out.println("both are equle");
        }
        else{
            System.out.println("not equle");
        }
    }
}
