
public class commonelement11 {
    public static void main(String args[]){
        int arr1[]={2,3,5,6,7};
        int arr2[]={3,5,2,7,8,9};
        int arr[]={};
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr[i]=arr1[i];
                    

                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }



    }
}
