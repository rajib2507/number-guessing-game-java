import java.util.Scanner;

public class arr2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k (positions to rotate left): ");
        int k = sc.nextInt();
        k = k % n;  // Handle k > n

        // Rotate
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }

        // Print rotated array
        System.out.println("Array after left rotation:");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}

