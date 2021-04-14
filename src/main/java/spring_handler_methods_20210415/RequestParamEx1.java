package spring_handler_methods_20210415;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamEx1 {

    // url = "/pets?petId=10"
    @GetMapping("/pets")
    public String setupForm(@RequestParam("petId") int petId) {
        return "";
    }

    // url = "/pets?petId=10"
    @GetMapping("/pets")
    public String createInstance(@RequestParam("petId") Pet pet) {
        return "";
    }
}
