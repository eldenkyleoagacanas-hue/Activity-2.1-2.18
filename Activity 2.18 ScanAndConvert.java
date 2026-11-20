import java.util.Scanner;

public class ScanAndConvert {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Enter grades
        System.out.print("Enter Java grade: ");
        String javaGrade = input.nextLine();

        System.out.print("Enter C++ grade: ");
        String cppGrade = input.nextLine();

        System.out.print("Enter C# grade: ");
        String csharpGrade = input.nextLine();

        // Convert String into Double
        double java = Double.parseDouble(javaGrade);
        double cpp = Double.parseDouble(cppGrade);
        double csharp = Double.parseDouble(csharpGrade);

        // Calculate total and average
        double total = java + cpp + csharp;
        double average = total / 3;

        // Display results
        System.out.println("\nFinal Grades");
        System.out.println("Java: " + java);
        System.out.println("C++: " + cpp);
        System.out.println("C#: " + csharp);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        input.close();
    }
}
