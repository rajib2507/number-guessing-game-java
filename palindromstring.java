import java.util.*;
public class palindromstring {
    public static boolean printpalindrom(String str){
        for(int i=0;i<(str.length())/2;i++){
             if (str.charAt(i) != str.charAt((str.length()) - 1 - i)) {
                return false; 
            }

        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        if (printpalindrom(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
