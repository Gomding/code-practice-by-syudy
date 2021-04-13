package customexception_4bestpractice_20210413;

public class ExceptionEx {

    public static void main(String[] args) {
        try {
            // doSomething
        } catch (RuntimeException e) {
            throw new MyCustomException("커스텀 예외 발생!!", e);
        }
    }
}

class MyCustomException extends RuntimeException {
    public MyCustomException() {
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
