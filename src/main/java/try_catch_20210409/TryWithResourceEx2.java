package try_catch_20210409;

public class TryWithResourceEx2 {

    public static void main(String[] args) {

        /*
        * try -> close -> finally 순서로 실행됨
        * 해당 순서의 원인은 바이트코드를 참고하는것이 좋음
        * 간단하게 말하면 try-with-resource는 내부에 try-catch-finally 문을 만들어 준다.
        * */
        try (MyClass myClass = new MyClass()) {
            System.out.println("try문 내부 실행됨");
            throw new Exception("예외 발생");
        } catch (Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("finally 실행됨");
        }
    }
}


