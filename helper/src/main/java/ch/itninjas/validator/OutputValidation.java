package ch.itninjas.validator;

/**
 * This class is a little helper for verify the console log output from a app.
 */
public class OutputValidation {

    /**
     * Add a new line to the saved output.
     * @param line The content from the line.
     */
    public void log(String line) {
    }

    /**
     * Add a new line to the saved output and print
     * this line also to the standard output.
     * @param line The content from the line.
     */
    public void logAndPrint(String line) {
    }

    /**
     * Print all saved output lines to the standard output,
     * in the same order as the lines are added.
     */
    public void printAll() {
    }

    /**
     * Calculate the hash of the whole saved outputs and print
     * the hash to the standard output.
     */
    public void printControlHash() {
    }

    /**
     * Calculate the hash of the whole saved output and verify
     * it with the controlHash parameter.
     * @param controlHash The hash for verify the calculated hash.
     * @return {@code true} if the calculated hash is equal to the
     *         controlHash or {@code false}.
     */
    public boolean verifyControlHash(int controlHash) {
        return false;
    }

}
