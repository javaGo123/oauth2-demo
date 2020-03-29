package irdc.blade.apiservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Calvin on 2020/03/29.
 */
@RestController
public class ApiController {

    @GetMapping("/hello")
    public String getRequest() {
        return "Hello World.";
    }
}
