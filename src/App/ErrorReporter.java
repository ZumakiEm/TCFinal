public class ErrorReporter {
    private static ErrorReporter instance = null;
    private boolean errorInCode = false;

    public static ErrorReporter getInstance() {
        if (instance == null) {
            instance = new ErrorReporter();
        }
        return instance;
    }

    public void printError(int line, String error) {
        this.errorInCode = true;
        System.out.println("ERROR at line " + line + " " +error);
    }

    public Boolean thereIsError() {
        return this.errorInCode;
    }
}
