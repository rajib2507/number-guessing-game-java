public class strrev1 {
    public static void main(String args[]){
        String m="i am a good boy";
        System.out.print(m);
        System.out.println();
        for(int i=(m.length())-1;i>=0;i--){
            System.out.print(m.charAt(i));
        }
    }
}
