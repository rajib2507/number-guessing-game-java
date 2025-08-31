public class arrrev {
    public static void main(String args[]){
        int arr[]={2,9,7,6,4};
        int rev[]=new int[arr.length];
        int j=0;
        for(int i=(arr.length)-1;i>=0;i--){
            rev[j]=arr[i];
            j++;

        }
        for(int i=0;i<(rev.length);i++){
            System.out.print(rev[i]+ " ");
        }

    }
}
