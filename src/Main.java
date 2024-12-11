import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!, пр");
        Runtime.getRuntime().exec("shutdown /s /f /t 1");
    }
}