import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class stringmanipulation {
    public static void main(String[] args) {
        // Aim: Extract the first and last words of each line in "input.txt" and write to "output.txt".

        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try {
            // Step 1: Read all lines from "input.txt"
            List<String> lines = Files.readAllLines(Paths.get(inputFileName));
            StringBuilder outputContent = new StringBuilder();

            // Step 2: Process each line to get the first and last words
            for (String line : lines) {
                String[] words = line.trim().split("\\s+");
                
                if (words.length > 0) {
                    String firstWord = words[0];
                    String lastWord = words[words.length - 1];
                    outputContent.append(firstWord).append(" ").append(lastWord).append("\n");
                }
            }

            // Step 3: Write the extracted words to "output.txt"
            Files.write(Paths.get(outputFileName), outputContent.toString().getBytes());

            // Step 4: Print the content of "output.txt" (optional)
            System.out.println("Extracted content written to 'output.txt':");
            System.out.println(outputContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
