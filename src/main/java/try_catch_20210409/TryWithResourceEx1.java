package try_catch_20210409;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceEx1 {

    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("something.txt")) {
            System.out.println("doSomething");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void tryCatchClose() {
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("something.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }
}
