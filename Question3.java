import javax.swing.JOptionPane;

public class Question3 {
    public static void main(String[] args) {
        int userInteger;
        int returnedInteger;
        String output;

        // Get the integer to be increased by 5 from the user
        userInteger = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number you wish to be increased by 5: "));

        // Call method with user integer and assign whatever is returned from the addFiveToInteger method to returnedInteger variable
        returnedInteger = addFiveToInteger(userInteger);

        // Add returnedInteger(value returned from addFive method) to message output
        output = userInteger+" increased by 5 is: "+returnedInteger;

        JOptionPane.showMessageDialog(null, output);
    }

    public static int addFiveToInteger(int anInteger) {
        int integerPlusFive;

        // Take argument passed from main method (user's integer) and add 5 to it. Return value back to main method
        integerPlusFive = anInteger + 5;
        return integerPlusFive;
    }
}
