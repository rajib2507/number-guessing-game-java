public class methodfact {
    static int factInt(int n){
        int m=1;
        for(int i=1;i<=n;i++){
            m=m*i;
        }
        return m;
    }
    public static void main(String args[]){
        int n=5;
        int result = factInt(n);
        System.out.println(result);
    }
}
