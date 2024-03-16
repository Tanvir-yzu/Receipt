public class Main {
    public static void main(String[] args) {
        // Calculate total owed, assuming 8% tax / 15% tip
        System.out.println("Subtotal:");
        System.out.println(38 + 40 + 30);
        System.out.println("Tax:");
        System.out.println((38 + 40 + 30) * .08);
        System.out.println("Tip:");
        System.out.println((38 + 40 + 30) * .15);
        System.out.println("Total:");
        System.out.println(38 + 40 + 30 +
                (38 + 40 + 30) * .08 +
                (38 + 40 + 30) * .15 *14.3);

        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (-1 * line + 5); j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= line; k++) {
                System.out.print(line);
            }

            System.out.println();
        }



    }

}
