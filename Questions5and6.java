import javax.swing.JOptionPane;

public class Questions5and6 {
    public static void main(String[] args) {
        // Call the toss the coin method
        tossTheCoin();
    }

    public static void tossTheCoin() {
        String result;
        double toss;
        int numOfTosses = 0;
        int numOfHeads = 0;
        int numOfTails = 0;

        // Set to loop 1000 times
        while (numOfTosses < 1000) {
            // Generate a random number between 0 and <1 and assign it to toss variable
            toss = Math.random();
            // If the random no. assigned to toss is larger than 0.5, increment number of tosses resulting in heads. (This method of random might not be truly random)
            // Otherwise, increment the number of tosses resulting in tails.
            // Always increment the number of tosses after a toss regardless of result.
            if (toss < 0.5) {
                numOfHeads++;
            }
            else {
                numOfTails++;
            }
            numOfTosses++;
        }
        // Prep and display output message with results of 1000 tosses.
        result = "Out of "+numOfTosses+" tosses, there were "+numOfHeads+" heads and there were "+numOfTails+" tails.";
        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
    }

}
