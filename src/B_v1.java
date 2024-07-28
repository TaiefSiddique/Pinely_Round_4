import java.util.Scanner;

public class B_v1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int t = ss.nextInt();
        while (t-- > 0) {
            int n = ss.nextInt();
            int[] b = new int[n - 1]; // Corrected size

            // Read elements into b
            for (int i = 0; i < n - 1; i++) {
                b[i] = ss.nextInt();
            }

            // Construct array a
            int[] a = new int[n];
            a[0] = 1; // Assuming the first element of a is always 1
            for (int i = 1; i < n; i++) {
                a[i] = a[i - 1] & b[i - 1];
            }

            // Print the constructed array a (optional)
            for (int element : a) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
