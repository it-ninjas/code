package ch.itninjas.validator;

public class OutputValidationUsage {

    private static final OutputValidation outputValidation = new OutputValidation();

    public static void main(String[] args) {
        outputValidation.logAndPrint("Programm is starting ...");
        OutputValidationUsage outputValidationUsage = new OutputValidationUsage();
        outputValidationUsage.verifyOutput();
    }

    public OutputValidationUsage() {
        outputValidation.logAndPrint("Start working");
        outputValidation.log("This is not a interesting line. Do not print to console.");
        outputValidation.logAndPrint("I work very hard!");
        outputValidation.logAndPrint("I'm finish.");
    }

    public void verifyOutput() {
        // print the saved console output
        outputValidation.printAll();
        // print the hash code
        outputValidation.printControlHash();
        // is the validation ok
        System.out.println(outputValidation.verifyControlHash(2128163011));
    }
}
