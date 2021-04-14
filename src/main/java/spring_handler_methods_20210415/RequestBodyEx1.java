package spring_handler_methods_20210415;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyEx1 {

    @PostMapping("/accounts")
    public void handle(@RequestBody Account account) {
        // ...
    }
}
