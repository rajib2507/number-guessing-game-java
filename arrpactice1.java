public class arrpactice1 {
    public static void main(String args[]){
        int arr1[]={4,6,3,5,8,2};
        int t=7;
        int count=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=(i+1);j<arr1.length;j++){
                if((arr1[i]+arr1[j])==t){
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}
