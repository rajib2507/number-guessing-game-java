import java.util.*;
public class palindromnumbewr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        if (isPalindrome(num)) {
System.out.println(num + " is a palindrome.");
} else {
System.out.println(num + " is not a palindrome.");
}


    }

    public static boolean isPalindrome(int num) {
int originalNumber = num;
int reversedNumber = 0;
while (num != 0) {
int digit = num % 10;
reversedNumber = reversedNumber * 10 + digit;
num = num/10;
}
return originalNumber == reversedNumber;
}

}
