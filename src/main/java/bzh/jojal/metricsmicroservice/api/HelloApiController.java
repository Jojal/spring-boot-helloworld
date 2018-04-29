package bzh.jojal.metricsmicroservice.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {

    @RequestMapping("/")
    public String home() {
        return "Welcome world !";
    }
}
