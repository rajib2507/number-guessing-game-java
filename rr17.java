import java.util.*;
public class rr17 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number range: ");
        int n=sc.nextInt();
        int first=0,second=1,next;
        for(int i=0;i<6;i++){
            System.out.print(first + "  ");
            next=first + second;
            first = second;
            second=next;
        }

    }
    
}
