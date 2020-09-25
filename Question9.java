import javax.swing.JOptionPane;

public class Question9 {
    public static void main(String[] args) {
        welcomeMessage();
        getMark();
    }

    // Print a welcome message
    public static void welcomeMessage() {
        String message;

        message = "Hello, how are you?";

        JOptionPane.showMessageDialog(null, message, "Hello", JOptionPane.INFORMATION_MESSAGE);
    }

    // Get the user's mark from input and validate it
    public static void getMark() {
        int mark;
        int maxMark = 100;
        int minMark = 0;
        int passMark = 10;
        int passes = 0;
        int fails = 0;
        int student = 1;
        int numOfStudents = 3;

        do {
            mark = Integer.parseInt(JOptionPane.showInputDialog("Please enter a mark: "));

            while (mark < minMark || mark > maxMark) {
                mark = Integer.parseInt(JOptionPane.showInputDialog("Please enter a valid mark between " + minMark + " and " + maxMark + "."));
            }
            if (mark >= passMark) {
                passes++;
            } else {
                fails++;
            }
            //increment counter
            student++;
        } while(student <= numOfStudents);


        // Number of passes and fails passed to the outputMessage method to display no. of passes and fails.
        outputMessage(passes, fails);
    }

    // Method accepts number of passes and fails from getGrade method and then displays these in a message.
    public static void outputMessage(int numPasses, int numFails) {
        String output;

        output = "The number of passes is "+numPasses+"\n";
        output = output + "The number of fails is "+numFails+".";
        JOptionPane.showMessageDialog(null, output, "Hello", JOptionPane.INFORMATION_MESSAGE);
    }
}
