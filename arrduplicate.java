public class arrduplicate {
    public static void main(String args[]){
        int arr[]={2,3,5,5,7,2};
        int count=0;
        for(int i=0;i<(arr.length);i++){
            for(int j=i+1;j<(arr.length);j++){
                if(arr[i]!=arr[j]){
                    count++;
                }
                
            }
        }
        System.out.println(count);

    }
}
