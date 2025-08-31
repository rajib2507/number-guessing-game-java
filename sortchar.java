import java.util.*;
public class sortchar {
    public static void main(String args[]){
        String str="dcba";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        String m=new String(chars);
        System.out.println(m);
    }
}
