import java.util.Vector;

public class LanguageVector {
    public static void main(String[] args) {
        // Create a new Vector
        Vector<String> languages = new Vector<>();

        // Assign values to the Vector using command line arguments
        for (int i = 0; i < args.length; i++) {
            languages.add(args[i]);
        }

        // Insert a new element at index 2
        languages.insertElementAt("Cobol", 2);

        // Print the contents of the Vector
        System.out.println("Languages:");
        for (String language : languages) {
            System.out.println(language);
        }
    }
}