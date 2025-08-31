public class methodprime {
    static boolean FinePrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
                
            }
            
        }
        return true;
    }
    public static void main(String args[]){
        int num=12;
        if (FinePrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
