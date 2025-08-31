public class arrpayersum {
    public static void main(String args[]){
        int arr[]={8, 7, 2, 5, 3, 1};
        int sum=10;
        for(int i=0;i<(arr.length)-1;i++){
            for(int j=(i+1);j<arr.length;j++){
                int m=arr[i]+ arr[j];
                if(sum==m){
                    System.out.println("payer is "+arr[i]+" and "+arr[j]);
                }
            }
        }
    }
}
