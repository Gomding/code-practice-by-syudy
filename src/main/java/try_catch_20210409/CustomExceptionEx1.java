package try_catch_20210409;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CustomExceptionEx1 {

    public static void main(String[] args) {

        /*
        * 예외 전환시 (catch 한 예외를 다른 예외로 전환 시키는것을 의미)
        * 발생했던 예외의 정보를 전환되는 예외에 넣어주는것이 좋다
        * 예외에 대한 정보 손실 방지
        * */
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("some.txt");
        } catch (FileNotFoundException e) {
            throw new MyCustomException("커스텀 예외로 전환", e);
        }
    }
}

class MyCustomException extends RuntimeException {

    public MyCustomException() {
    }

    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCustomException(Throwable cause) {
        super(cause);
    }

    public MyCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
