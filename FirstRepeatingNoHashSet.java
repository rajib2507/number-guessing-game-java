public class FirstRepeatingNoHashSet {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3,10, 4, 3, 5, 6};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    System.out.println("First non repeating element: " + arr[i]);
                    found = false;
                    break; // stop checking further for i
                }
            }
            if (found) break; // stop when first repeating is found
        }

       
    }
}

