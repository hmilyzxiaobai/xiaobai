package com.unfbx.chatgptsteamoutput.controller.response;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/health")
    public String health() {
        return "succeed";
    }
}
