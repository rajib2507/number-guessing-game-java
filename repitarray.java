public class repitarray {

    public static void main(String args[]){
        int arr1[]={1,2,3,4,3,2,1};
        int t=7;
        int count=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=(i+1);j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    arr1[i]=0;
                    arr1[j]=0;

                }
                
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}


