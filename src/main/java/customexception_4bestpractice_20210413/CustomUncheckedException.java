package customexception_4bestpractice_20210413;

public class CustomUncheckedException extends RuntimeException {

    public CustomUncheckedException() {
    }

    public CustomUncheckedException(String message) {
        super(message);
    }

    public CustomUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomUncheckedException(Throwable cause) {
        super(cause);
    }

    public CustomUncheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class CustomUncheckedExceptionTest {
    public static void main(String[] args) {
        try {
            // doSomething
        } catch (RuntimeException e) {
            throw new CustomUncheckedException("커스텀 언체크드 예외 발생!!", e);
        }
    }
}