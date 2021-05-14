  
public class ErrorReporter {
    private static ErrorReporter instance = null;

    public static ErrorReporter getInstance() {
        if (instance == null) {
            instance = new ErrorReporter();
        }
        return instance;
    }

    public static void printError(int line, String error) {
        System.out.println("ERROR\tLine " + line + error);
    }
}
