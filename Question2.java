import javax.swing.JOptionPane;

public class Question2 {
    public static void main(String[] args) {
    int userInteger;

    // Get the integer from user input
    userInteger = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));

    // Call the printInteger method with the user's integer as an argument
    printInteger(userInteger);
    }

    // Method being called expects an integer (the user's integer)
    public static void printInteger(int anInteger) {
        String output;

        // Create an output message using the argument passed from main method
        output = "The integer you entered was: "+anInteger+".";
        JOptionPane.showMessageDialog(null, output);
    }
}
