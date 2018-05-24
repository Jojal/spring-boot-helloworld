package bzh.jojal.metricsmicroservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {

    @GetMapping("/")
    public String home() {
        return "Welcome world on pipeline branch pipeline 2!";
    }
}
