import javax.swing.JOptionPane;

public class Question8 {
    public static void main(String[] args) {
        String usersName;
        String usersAddress;
        int usersAge;

        // Get the user's name, address and age
        usersName = JOptionPane.showInputDialog("Please enter your name: ");
        usersAddress = JOptionPane.showInputDialog("Please enter your address: ");
        usersAge = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));

        // Call the printDetails method with corresponding variables
        printDetails(usersName, usersAddress, usersAge);
        printDetails(usersName, usersAddress);
        printDetails(usersName, usersAge);
        // Note the order of variables for the call below is switched, in order to avoid compile error. Since the call above has
        // the same order if the order of variables are not switched, it will cause an error since compiler can't differentiate between
        // types passed with different results!!!
        printDetails(usersAge, usersAddress);
    }

    // Method called with all input variables
    public static void printDetails(String aName, String anAddress, int anAge) {
        String output;

        output = "Your name is "+aName+", you live at "+anAddress+" and you are "+anAge+" years old.";
        JOptionPane.showMessageDialog(null, output, "Your Name, Address and Age", JOptionPane.PLAIN_MESSAGE);
    }

    // Method called with only name and address variables
    public static void printDetails(String aName, String anAddress) {
        String output;

        output = "Your name is "+aName+" and you live at "+anAddress+".";
        JOptionPane.showMessageDialog(null, output, "Your Name and Address", JOptionPane.PLAIN_MESSAGE);
    }

    // Method called with only name and age variables
    public static void printDetails(String aName, int anAge) {
        String output;

        output = "Your name is "+aName+" and you are "+anAge+" years old.";
        JOptionPane.showMessageDialog(null, output, "Your Name and Age", JOptionPane.PLAIN_MESSAGE);
    }

    // Method called with only age and address variables
    // Note how the age and address have the same types as above method, but have been switched to avoid compiler error.
    public static void printDetails(int anAge, String anAddress) {
        String output;

        output = "You live at "+anAddress+" and you are "+anAge+" years old.";
        JOptionPane.showMessageDialog(null, output, "Your Name, Address and Age", JOptionPane.PLAIN_MESSAGE);
    }
}
