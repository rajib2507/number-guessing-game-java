public class methotableofnum {
    static void Tableof(int n){
        for(int i=1;i<=10;i++){
            int m=n*i;
            System.out.println(n + " x " + i + " = " + m);
        }
    }
    public static void main(String args[]){
        int n=5;
        Tableof(n);
    }
}
