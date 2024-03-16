public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the diamond

        // Upper half of the diamond
        for (int i = 0; i < n; i++) { // Loop for each row in the upper half
            for (int j = 0; j < n - i - 1; j++) { // Loop to print spaces before the diamond
                System.out.print(" ");
            }
            System.out.print("<>"); // Print the left side of the diamond
            if (i > 0) { // For rows after the first one
                for (int j = 0; j < 2 * i - 1; j++) { // Loop to print dots between the diamonds
                    System.out.print(".");
                }
                System.out.print("<>"); // Print the right side of the diamond
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Lower half of the diamond
        for (int i = n - 2; i >= 0; i--) { // Loop for each row in the lower half
            for (int j = 0; j < n - i - 1; j++) { // Loop to print spaces before the diamond
                System.out.print(" ");
            }
            System.out.print("<>"); // Print the left side of the diamond
            if (i > 0) { // For rows before the last one
                for (int j = 0; j < 2 * i - 1; j++) { // Loop to print dots between the diamonds
                    System.out.print(".");
                }
                System.out.print("<>"); // Print the right side of the diamond
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
