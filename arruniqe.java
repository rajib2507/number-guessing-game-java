public class arruniqe {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        System.out.println("Unique elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            // Check if arr[i] appears again
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If element is unique, print it
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
