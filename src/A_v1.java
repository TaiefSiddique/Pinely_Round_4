import java.util.Scanner;

public class A_v1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int t = ss.nextInt();  // Read the number of test cases

        while (t-- > 0) {
            int n = ss.nextInt();  // Read the length of the array
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = ss.nextInt();  // Read the elements of the array
            }

            System.out.println(maxRemainingElement(a));
        }

        ss.close();
    }

    public static int maxRemainingElement(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return arr[0];
        }

        // Repeatedly remove the smallest adjacent pair until one element remains
        while (n > 1) {
            int minIndex = 0;
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] + arr[i + 1] < arr[minIndex] + arr[minIndex + 1]) {
                    minIndex = i;
                }
            }

            // Remove elements at minIndex and minIndex + 1
            for (int i = minIndex + 2; i < n; i++) {
                arr[i - 2] = arr[i];
            }

            n -= 2;
        }

        return arr[0];
    }
}
