public class arrnonrepelimentfirst {
    public static void main(String args[]) {
        int arr[] = {9, 4, 9, 6, 7, 4};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) { // check duplicates anywhere
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("First non-repeating element: " + arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating element found");
        }
    }
}
