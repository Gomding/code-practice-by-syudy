package spring_handler_methods_20210415;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelAttributeEx1 {

    @GetMapping("/owners/{ownerId}")
    public String someSubmit(@ModelAttribute("ownerId") int ownerId) {
        return "";
    }

    @PostMapping("/owners/{ownerId}/pets/{petId}/edit")
    public String processSubmit(@ModelAttribute Pet pet) {
        return "";
    }

    // requestUrl = "/owners/pets?ownerId=10&petId=20"
    @GetMapping("/owners/pets")
    public String processSubmit2(@ModelAttribute Pet pet) {
        return " ";
    }
}
