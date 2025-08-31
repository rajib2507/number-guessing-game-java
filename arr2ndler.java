public class arr2ndler {
    public static void main(String args[]){
        int arr1[]={6,6,3,8,1};
        int large1=arr1[0];
        int large2=0;
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]>large1){
                large2=large1;
                large1=arr1[i];
                
            }
            
            
        }
        System.out.println(large2);
    }
}
