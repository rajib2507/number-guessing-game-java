public class methodstringrevers {
    public static void reverseAndPrint(String input) {
        // Convert string to char array and reverse
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println(); // Move to next line
    }

    public static void main(String[] args) {
        String text = "Hello World";
        reverseAndPrint(text);
    }
}
