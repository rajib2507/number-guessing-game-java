public class arrayrotatedleftk {
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5,6,7};
        int m=arr1.length;
        int leftroated[]=new int[m];
        int k=3;
        int j=0;
        for(int i=k;i<m;i++){
            leftroated[j]=arr1[i];
            j++;

        }
        for(int i=0;i<k;i++){
            leftroated[j]=arr1[i];
            j++;
        }
        for(int i=0;i<j;i++){
            System.out.print(leftroated[i]+" ");
        }

    }
}
