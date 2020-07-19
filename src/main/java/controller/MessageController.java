package controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@RestController
@RequestMapping("message")
public class MessageController {
    @GetMapping
    public String list(){
        return "index";
    }
}
