    import java.util.Scanner;
    public class question45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        for (int i = 0; i < numRows; i++) {
            // Print spaces for formatting
            for (int space = 0; space < numRows - i; space++) {
                System.out.print(" ");
            }

            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}

    

