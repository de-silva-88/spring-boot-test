package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("boot-ex")
public class HelloController {

    @RequestMapping("/")
    public String index() {
        System.out.println("index service invoked after jenkins-deploy");
        return "Greetings from Spring Boot!";
    }

}
