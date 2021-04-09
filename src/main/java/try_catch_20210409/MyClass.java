package try_catch_20210409;

public class MyClass implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("close 호출됨");
    }
}

