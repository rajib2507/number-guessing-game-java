import java.util.*;
public class guessing_number_game {
    public static void main(String args[]){
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);
        int randomnumber = ran.nextInt(100)+1;
        int n=0;
        int att=0;
        while(n!=randomnumber){
        System.out.print("enter a random number (1-100) : ");
        n=sc.nextInt();
        att++;
        if(n==randomnumber){
            System.out.println("you are right . " +"you take " + att+" attemptes.");
        }
        else if(n>randomnumber){
            System.out.println("enter a small number ");
        }
        else if(n<randomnumber){
            System.out.println("enter a learge number");
        }
     }
     sc.close();

    }
}
