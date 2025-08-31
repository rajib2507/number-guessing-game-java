public class methodvowelcount {
    static void VowelCount(String S){
        S = S.toLowerCase();
        int count =0;
        for(int i=0;i<S.length();i++){
            char m = S.charAt(i);
            if(m =='a' || m=='e' || m=='i' || m=='o' || m=='u'){
                count ++;
            }


        }
        System.out.println(count);

    }
    public static void main(String args[]){
        String S="ar ar";
        VowelCount(S);
    }
}
