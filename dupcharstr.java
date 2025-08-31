import java.util.*;
public class dupcharstr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String m=sc.nextLine();
        
        for(int i=0;i<m.length();i++){
            for(int j=(i+1);j<m.length();j++){
                if(m.charAt(i)==m.charAt(j)){
                    
                    System.out.println(m.charAt(i) );
                }
            }
        }

    }
}
