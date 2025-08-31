public class backtracking {
    public static void printstr(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char character = str.charAt(i);
            String newstr=str.substring(0 , i) + str.substring(i+1);
            printstr(newstr,perm+character,idx+1);

        }

    }
    public static void main(String args[]){
        String str="ABC";
        printstr(str,"",0);

    }
}
