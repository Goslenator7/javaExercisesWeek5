import javax.swing.JOptionPane;

public class Question7 {
    public static void main(String[] args) {
        String userStringOne, userStringTwo, userStringThree;
        int userIntOne, userIntTwo, userIntThree;
        double userDoubleOne, userDoubleTwo, userDoubleThree;

        // Get three integers from the user
        userIntOne = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));
        userIntTwo = Integer.parseInt(JOptionPane.showInputDialog("Please enter another number: "));
        userIntThree = Integer.parseInt(JOptionPane.showInputDialog("Please enter another number: "));
        // Call addTogether method that expects three integers
        addTogether(userIntOne, userIntTwo, userIntThree);

        // Get three strings from the user
        userStringOne = JOptionPane.showInputDialog("Please enter a word: ");
        userStringTwo = JOptionPane.showInputDialog("Please enter another word: ");
        userStringThree = JOptionPane.showInputDialog("Please enter another word: ");
        // Call addTogether method that expects three strings
        addTogether(userStringOne, userStringTwo, userStringThree);

        // Get three decimals from the user
        userDoubleOne = Double.parseDouble(JOptionPane.showInputDialog("Please enter a decimal number: "));
        userDoubleTwo = Double.parseDouble(JOptionPane.showInputDialog("Please enter another decimal number: "));
        userDoubleThree = Double.parseDouble(JOptionPane.showInputDialog("Please enter another decimal number: "));
        // Call addTogether method that expects three doubles
        addTogether(userDoubleOne, userDoubleTwo, userDoubleThree);
    }

    // addTogether method which expects the three strings from the user input.
    // Concatenates them together and outputs the sentence in a message.
    public static void addTogether(String firstString, String secondString, String thirdString) {
        String sentence;

        sentence = firstString+" "+secondString+" "+thirdString+".";
        JOptionPane.showMessageDialog(null, sentence, "Your sentence",JOptionPane.PLAIN_MESSAGE);
    }

    // addTogether method that expects the three integers from the user input.
    // Adds the integers together and outputs the total in a message.
    public static void addTogether(int firstInt, int secondInt, int thirdInt) {
        int intTotal;
        String output;

        intTotal = firstInt+secondInt+thirdInt;
        output = "The total of your numbers "+firstInt+", "+secondInt+", "+thirdInt+" is "+intTotal+".";
        JOptionPane.showMessageDialog(null, output, "Your Total", JOptionPane.PLAIN_MESSAGE);
    }

    // addTogether method that expects the three doubles from the user input.
    // Adds the doubles together and outputs the total in a message.
    public static void addTogether(double firstDouble, double secondDouble, double thirdDouble) {
        double doubleTotal;
        String output;

        doubleTotal = firstDouble+secondDouble+thirdDouble;
        output = "The total of your numbers "+firstDouble+", "+secondDouble+", "+thirdDouble+" is "+doubleTotal+".";
        JOptionPane.showMessageDialog(null, output, "Your Total", JOptionPane.PLAIN_MESSAGE);
    }


}
