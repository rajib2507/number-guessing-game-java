import java.util.*;
public class vawelstring {
    public static int printvawel(String str){
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;

            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int num= printvawel(str);
        System.out.println("Number of vowels in \"" + str + "\": " +num );


    }
}
