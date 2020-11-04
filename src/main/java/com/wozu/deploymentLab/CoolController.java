package com.wozu.deploymentLab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pages/cool")
public class CoolController {

    @GetMapping("/get")
    public String getCool() {
        return "This is very cool";
    }
}
