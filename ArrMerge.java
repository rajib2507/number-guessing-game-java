public class ArrMerge {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 4};
        int arr2[] = {5, 6, 7};

        int arr3[] = new int[arr1.length + arr2.length];

        // Copy arr1
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        // Copy arr2
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + j] = arr2[j];
        }

        // Print merged array
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + " ");
        }
    }
}
