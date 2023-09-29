
public sealed class Exam1B_ChatGPT {public static void main(String[] args) {
    // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // Display a welcome message
    System.out.println("Welcome to the Text Processing Program!");

    // Ask the user for text input
    System.out.print("Please enter a text: ");
    String userInput = scanner.nextLine();

    // Print the length of the provided input
    int inputLength = userInput.length();
    System.out.println("The length of the input is: " + inputLength);

    // Ask the user for a character to find in the input
    System.out.print("Please enter a character to find: ");
    char charToFind = scanner.next().charAt(0);

    // Find the location of the first occurrence of the character
    int charLocation = userInput.indexOf(charToFind);

    // Printout the location of the first occurrence (if found)
    if (charLocation != -1) {
        System.out.println("The first occurrence of '" + charToFind + "' is at position: " + charLocation);
    } else {
        System.out.println("The character '" + charToFind + "' was not found in the input.");
    }

    // Close the scanner to prevent resource leak
    scanner.close();
}
}






}
