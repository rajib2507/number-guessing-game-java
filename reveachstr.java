public class reveachstr {
    public static void main(String[] args) {
        String input = "Java is fun";
        String result = reverseEachWord(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed Words: " + result);
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse()).append(" ");
        }

        return reversedString.toString().trim();  // Remove trailing space
    }
    
}
