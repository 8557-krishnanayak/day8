import java.io.IOException;

public class ExceptionChaining {
    public static void main(String[] args) {

        try {
            readFiles();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("Original cause: " + e.getCause());
        }

    }

    private static void readFiles() throws Exception {
        try {
            throw new IOException("Error on reading File");
        } catch (IOException e) {
            throw new Exception("Exception occur on reading file method", e);
        }
    }
}
