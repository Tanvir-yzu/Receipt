public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the diamond

        // Upper half of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.print("<>");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("<>");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.print("<>");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("<>");
            }
            System.out.println();
        }
    }
}
