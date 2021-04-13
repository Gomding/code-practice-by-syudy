package customexception_4bestpractice_20210413;

/*
* 이것은 커스텀 CheckedException 입니다.
* 자바의 기본 예외로 표현할 수 없는 예외를 제공하기 위해 만들어졌습니다.
* */
public class CustomCheckedExceptionEx extends Exception {

    public CustomCheckedExceptionEx() {
    }

    public CustomCheckedExceptionEx(String message) {
        super(message);
    }

    public CustomCheckedExceptionEx(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomCheckedExceptionEx(Throwable cause) {
        super(cause);
    }

    public CustomCheckedExceptionEx(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class CustomCheckedExceptionTest {
    public static void main(String[] args) throws CustomCheckedExceptionEx {
        try {
            // doSomething
        } catch (Exception e) {
            throw new CustomCheckedExceptionEx("커스텀 체크드 예외 발생!!");
        }
    }
}
