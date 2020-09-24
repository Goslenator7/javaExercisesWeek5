import javax.swing.JOptionPane;

public class Question4 {
    public static void main(String[] args) {
        String output;
        int userMark;
        char returnedGrade;

        // Get the integer mark from the user's input
        userMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter the mark you got on the test: "));

        // If the user's input is not within the range of 0 - 100, loop until a valid mark is entered
        while (userMark < 0 || userMark > 100) {
            JOptionPane.showMessageDialog(null, "Please enter a valid mark between 0 and 100.");
            userMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter the mark you got on the test: "));
        }

        // Send the valid mark to the calculateGrade method
        calculateGrade(userMark);

        // Assign the grade (char) returned from method to variable returnedGrade
        returnedGrade = calculateGrade(userMark);

        // Formulate output message
        output = "Your grade was: "+returnedGrade;

        // Display message
        JOptionPane.showMessageDialog(null, output);
    }

    public static char calculateGrade(int aMark) {
        // Determine which grade level userMark falls into, and return the grade to the main method as a char
        if (aMark > 75 && aMark < 100) {
            return 'A';
        }
        else if (aMark > 60 && aMark < 74) {
            return 'B';
        }
        else if (aMark > 50 && aMark < 59) {
            return 'C';
        }
        else {
            return 'F';
        }
    }
}
