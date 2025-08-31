import java.util.Arrays;
public class arrsortascdec {
    public static void main(String args[]){
        int arr1[]={2,4,6,3,9,1};
        Arrays.sort(arr1);
        System.out.print(Arrays.toString(arr1));
        int rev[]=new int[arr1.length];
        int j=0;
        System.out.println();
        for(int i = (arr1.length)-1 ; i >= 0 ; i--){
            rev[j]=arr1[i];
            j++;
        }
        for(int i = 0 ; i < rev.length ; i++){
            System.out.print(rev[i]+" ");
        }

    }
}
