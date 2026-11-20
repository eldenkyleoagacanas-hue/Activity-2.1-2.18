public class Box {
    public static void main(String[] args) {

        for (int row = 0; row < 7; row++) {

            // Print the box
            for (int col = 0; col < 10; col++) {
                if (row == 0 || row == 6 || col == 0 || col == 9) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");

            // Print the diamond
            for (int col = 0; col < 7; col++) {
                if (col == 3 - Math.min(row, 6 - row) ||
                    col == 3 + Math.min(row, 6 - row)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
