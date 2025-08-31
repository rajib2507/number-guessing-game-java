public class arrcopy {
    public static void main(String args[]){
        int arr1[]={2,4,10,6,8,9};
        int arr2[]=new int[arr1.length];
        for(int i=0;i<(arr1.length);i++){
            arr2[i]=arr1[i];

        }
        for(int i=0;i<(arr2.length);i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
