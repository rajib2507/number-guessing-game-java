
import java.lang.FdLibm.Pow;
import java.util.*;
public class recer3 {
    static int squrintt(int a,int b){
        if(b==0){
            return 1;
        }
        int sans=Pow(a, b-1);
        return sans*a;

    }
    public static void main(String args[]){
        int a=2,b=2;
        System.out.println(squrintt(a,b));
    }
}
