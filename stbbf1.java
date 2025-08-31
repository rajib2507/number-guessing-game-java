import java.util.*;
public class stbbf1 {
    public static void main(String args[]){
        StringBuilder m= new StringBuilder("raj ib");
        //print string
        System.out.println(m);
        //char at inderx 0
        System.out.println(m.charAt(0));
        //set char at index 0
        m.setCharAt(0, 'p');
        System.out.println(m);

        //insert char in index0
        m.insert(0,'s');
        System.out.println(m);
        //delete
        m.delete(2,3);
        System.out.println(m);
        //insert in last
        m.append("mmm");
        System.out.println(m);




    }
}
