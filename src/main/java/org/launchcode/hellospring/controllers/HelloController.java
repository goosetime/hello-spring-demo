package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
//@RequestMapping("hello") EVERYTHING at /hello then /whatever
public class HelloController {
    // Handles request at path/hello
    @GetMapping("hello")
    public String hello() {
        return "Hello from the HelloController controller class method hello().... uh damn I live in a weird place.";
    }
    @GetMapping("goodbye")
    public String goodbye() {
        return "Well this is the end..... time to go. SKIPPIDEE-BOP-BUH-DAH-DAT-*explostion pssshhh noise*";
    }

    //Handles requests of the form /hello?name=Launchcode

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hellooo")
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "! YES! OH YES! OH FUCK YES! OH FUCK YES SIR!";
    }

    //Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello " + name + "! BASED GRANDMA?";
    }

    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hellooo' method = 'post'>" + //submit a request to /hello
                "<input type = 'type' name = 'name'>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
