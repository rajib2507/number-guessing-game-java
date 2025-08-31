public class arrmissingnumber {
    public static void main(String args[]){
        int arr[]={1,2,4,5,6};
        int n=6;
        int totalsum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            
        }
        if(totalsum != sum){
            int m=totalsum - sum;
            System.out.println("missing number is "+m);
        }
        else{
            System.out.println("no number is missing");
        }
    }
}
