import java.util.Scanner;

public class LineCounter {
    public static void main(String[] args) {
        // Check if a text argument is provided
        if (args.length == 0) {
            System.out.println("Usage: java LineCounter [text]");
            System.exit(1);
        }

        // Join all arguments into a single text string (in case of spaces in input)
        String inputText = String.join(" ", args);

        // Count lines
        int lineCount = countLines(inputText);

        // Print the result
        System.out.println("Number of lines: " + lineCount);
    }

    public static int countLines(String text) {
        // Use Scanner to count lines
        Scanner scanner = new Scanner(text);
        int lines = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            lines++;
        }

        scanner.close();
        return lines;
    }
}
