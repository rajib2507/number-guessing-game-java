public class recursivemethodfactorial{
    public static void main(String args[]){
        int num=5;
        int fac=Facnum(num);
        System.out.println(fac);
    }
    static int Facnum(int num){
        if (num == 0 || num == 1) {
            return 1;
        }
        
        
         
        return num*(Facnum(num-1));
    }
}