package try_catch_20210409;

public class TryCatchEx1 {

    public static void main(String[] args) {

        try {
            System.out.println("정상");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException 발생");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException 발생");
        }

        /*
        멀티 캐치문에서도 상속관계의 Exception을 사용하면 컴파일 에러가 발생한다.
        try {
            System.out.println("정상");
        } catch (IllegalArgumentException | RuntimeException e) {
            System.out.println("IllegalArgumentException 발생");
        }
        */

        /*
        컴파일 에러가 발생하는 try-catch 문
        RuntimeException 이 IllegalArgumentException 의 상위 클래스이기 때문에(더 포괄적인 예외)
        밑에 있는 IllegalArgumentException 은 어차피 사용될 일이 없어진다.
        try {
            System.out.println("정상");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException 발생");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException 발생");
        }
        */
    }
}

