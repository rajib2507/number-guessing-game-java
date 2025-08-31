public class methodmaxintwonum {
    static void Maxnum(int num1 , int num2){
        if(num1>num2){
            System.out.println(num1 + " is max");
        }
        else if(num2>num1){
            System.out.println(num2 + " is max");
        }
        else{
            System.out.println("both are equle");
        }
    }
    public static void main(String args[]){
        int num1=80;
        int num2=80;
        Maxnum(num1,num2);
    }
}
