import java.util.Scanner;

public class B_v2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
ugy
        // Read the size of the array
        int n = sc.nextInt();
        int[] b = new int[n - 1];

        // Read the array b
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }

        // Construct the array a
        int[] a = new int[n];

        // Initialize the first element
        a[0] = b[0];
        boolean possible = true;

        for (int i = 1; i < n; i++) {
            a[i] = b[i - 1];
            if ((a[i - 1] & a[i]) != b[i - 1]) {
                possible = false;
                break;
            }
        }
        // Output the result
        if (possible) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("NO");
        }
    }
}
