public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 2, 3, 3, 3};
        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.println("Majority element: " + arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No majority element found");
        }
    }
}

