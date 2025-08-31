import java.util.Arrays;

public class arrmoveallzeroatend {
    public static void main(String args[]){
        int arr1[]={0,2,5,0,2,0};
        int index=0;
        for(int i=0;i< (arr1.length) ;i++){
            if(arr1[i]!=0){
                arr1[index]=arr1[i];
                index++;
            }

        }
        while(index<arr1.length){
            arr1[index]=0;
            index++;
        }
        System.out.println("After moving zeros: " + Arrays.toString(arr1));
    }
}
