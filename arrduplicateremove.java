public class arrduplicateremove {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};
        int n = arr.length;

        // Removing duplicates
        int newLength = n;
        for (int i = 0; i < newLength; i++) {
            for (int j = i + 1; j < newLength; j++) {
                if (arr[i] == arr[j]) {
                    // Shift elements left to overwrite duplicate
                    for (int k = j; k < newLength - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    newLength--; // Reduce array size
                    j--; // Stay at same index after shifting
                }
            }
        }

        // Print array without duplicates
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
