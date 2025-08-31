import java.util.*;

class all{
    int add(int a, int b){
        int ans=a+b;
        return ans;
    }
}
public class rr14 {
    public static void main(String args[]){
        all obj = new all();
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.print("output is: ");
        int ans = obj.add(x,y);
        System.out.print(ans);

    }
    
}
