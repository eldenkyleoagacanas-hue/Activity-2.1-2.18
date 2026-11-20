public class Number {
    public static void main(String[] args) {

        // Display table headings
        System.out.println("number\tsquare\tcube");

        // Calculate and display squares and cubes
        for (int i = 0; i <= 3; i++) {
            int square = i * i;
            int cube = i * i * i;

            System.out.println(i + "\t" + square + "\t" + cube);
        }
    }
}
