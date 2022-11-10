package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login () {
        return "index";
    }
    @GetMapping("/")
    public String index () {
        return "index";
    }
    @GetMapping("")
    public String logon () {
        return "index";
    }
    @PostMapping("/log")
    public String log () {
        return "redirect:/home";
    }
}
