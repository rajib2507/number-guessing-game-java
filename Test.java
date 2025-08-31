public class Test {

    static void hello(int m){
        if(m==3){
            System.out.println("value is 3");
            return ;
        }
        int k=m-3;
        System.out.println(k + " nees to sub");
        
    }

    public static void main(String[] args){
        int m=3;
       hello(m);
       

    }
    
}
