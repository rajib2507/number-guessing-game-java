public class methodswaptwonum {
    static void Swapnum(int A,int B){
        System.out.println("Befor swap valu of A ="+ A+" and valu of B = "+ B);
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("After swap valu of A = "+A+" and valu of B = "+B);


    }
    public static void main(String args[]){
        int A=5;
        int B=6;
        Swapnum(A,B);
    }
}
