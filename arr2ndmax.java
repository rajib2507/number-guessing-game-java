public class arr2ndmax {


    public static void main(String args[]){
        int arr1[]={1,2,3,4,1,2,1};
        int t=7;
        int sub=0;
        int max=arr1[0];
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
            
            
        }
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]>sub && arr1[i]!=max){
                sub=arr1[i];
            }
            
            
        }
        System.out.println(sub);
        

        // for(int i=0;i<arr1.length;i++){
        //     if(arr1[i]!=0){
        //         count++;
        //     }
        // }
        // System.out.println(count);
    }




}
