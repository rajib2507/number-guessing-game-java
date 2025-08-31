public class methodarrlearge {
    static int ArrLearge(int[] arr){
        int n=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>n){
                n=arr[i];
            }
        }
        return n;
    }
    public static void main(String args[]){
        int[] arr={3,5,10,1,9};
        int num=ArrLearge(arr);
        System.out.println(num);
    }
}
