public class arr1b {
    public static void main(String args[]){
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7};
        
        int m=arr1.length;
        int n=arr2.length;
        int arr3[]=new int[m+n];
        for(int i=0;i<m;i++){
            arr3[i]=arr1[i];
        }
        int o=0;
        for(int i=m;i<(m+n);i++){
            arr3[i]=arr2[o];
            o++;
        }
        for(int i=0;i<(m+n);i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
